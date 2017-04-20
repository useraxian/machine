package com.ahem.machine.weixin.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ahem.common.utils.EmojiFilterUtil;
import com.ahem.machine.pub.mapper.TMachineUserMapper;
import com.ahem.machine.pub.mapper.TWeixinUserMapper;
import com.ahem.machine.pub.po.TMachineUser;
import com.ahem.machine.pub.po.TMachineUserExample;
import com.ahem.machine.pub.po.TWeixinUser;
import com.ahem.machine.pub.po.TWeixinUserExample;
import com.github.sd4324530.fastweixin.api.response.GetUserInfoResponse;

@Service
@Transactional
public class WeixinUserService {
	@Autowired
	TWeixinUserMapper wxUserMapper;

	@Autowired
	TMachineUserMapper machineUserMapper;

	/**
	 * 添加用户：如果存在微信用户，则更新信息
	 * 
	 * @param wxUser
	 * @return
	 */
	public int add(GetUserInfoResponse userInfo) {
		int result = 0;
		Date date = new Date();
		TWeixinUser wxUser = new TWeixinUser();
		wxUser.setOpenId(userInfo.getOpenid());
		wxUser.setCity(userInfo.getCity());
		wxUser.setCountry(userInfo.getCountry());
		wxUser.setHeadimgurl(userInfo.getHeadimgurl());

		wxUser.setNickname(EmojiFilterUtil.filterEmoji(userInfo.getNickname()));
		// wxUser.setPrivilege(userInfo.getp());
		wxUser.setProvince(userInfo.getProvince());
		wxUser.setSex(userInfo.getSex());
		wxUser.setLoginTime(date);

		boolean hasUser = this.hasUser(userInfo.getOpenid());
		if (hasUser) {
			result = wxUserMapper.updateByPrimaryKey(wxUser);
		} else {
			TMachineUser machineUser = new TMachineUser();
			machineUser.setWeixinOpenId(userInfo.getOpenid());
			machineUser.setLoginTime(date);
			wxUserMapper.insertSelective(wxUser);
			machineUserMapper.insertSelective(machineUser);
		}

		return result;
	}

	/**
	 * 是否已经有用户记录
	 * 
	 * @param openId
	 * @return
	 */
	public boolean hasUser(String openId) {
		TWeixinUser users = findByOpenId(openId);
		return users != null;
	}

	/**
	 * 根据openid获取用户
	 * 
	 * @param openId
	 * @return
	 */
	public TWeixinUser findByOpenId(String openId) {
		TWeixinUserExample example = new TWeixinUserExample();
		example.createCriteria().andOpenIdEqualTo(openId);
		List<TWeixinUser> list = wxUserMapper.selectByExample(example);
		return list.size() > 0 ? list.get(0) : null;
	}

	/**
	 * 根据微信OPENID获取用户
	 * 
	 * @param openId
	 * @return 查询不到返回null
	 */
	public TMachineUser findMachineUserByOpenId(String openId) {
		TMachineUserExample example = new TMachineUserExample();
		example.createCriteria().andWeixinOpenIdEqualTo(openId);
		List<TMachineUser> users = machineUserMapper.selectByExample(example);
		return users.size() > 0 ? users.get(0) : null;
	}

}
