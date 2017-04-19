package com.ahem.machine.weixin.core;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ahem.machine.pub.po.TMachineIndex;
import com.ahem.machine.pub.po.VBetStatistic;
import com.ahem.machine.weixin.service.BetStatisticService;
import com.ahem.machine.weixin.service.IndexService;

/**
 * <p>
 * Title: MaxGenerator.java
 * </p>
 * <p>
 * Description: 盈利最大化开奖策略
 * </p>
 * 
 * @author ahem
 * @date 2017年4月7日
 * @version
 */
@Component("maxGenerator")
public class MaxGenerator implements IGenerator {

	@Autowired
	BetStatisticService statisticService;

	@Autowired
	IndexService indexService;

	@Override
	public Integer generate(Integer recordId) {
		List<VBetStatistic> statistics = statisticService.findBetStatistics(recordId);
		if (statistics.size() == 0) {
			Random random = new Random();
			return random.nextInt(24);
		}
		Integer maxFuitId = 0;
		Integer maxProfit = 0;// 利润
		Integer payScore = -1;// 分数
		Integer sum = 0;
		for (int i = 0; i < statistics.size(); i++) {
			VBetStatistic statistic = statistics.get(i);
			sum += statistic.getAllSum().intValue();
		}

		for (int i = 0; i < statistics.size(); i++) {
			VBetStatistic statistic = statistics.get(i);
			Integer score = statistic.getAllSum().intValue();
			if (payScore > score || payScore == -1) {
				maxFuitId = statistic.getFruitId();
				payScore = score;
				maxProfit = sum - score;
			}
		}

		// TODO 记录每一期的盈利结果

		// 获取水果位置,随机取一个位置作为开奖号码
		List<TMachineIndex> indexLs = indexService.findIndexByFruit(maxFuitId);
		Random random = new Random();
		int rdInt = random.nextInt(indexLs.size());
		TMachineIndex index = indexLs.get(rdInt);
		return index.getId();
	}

}
