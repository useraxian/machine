package com.ahem.machine.weixin.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.ahem.machine.weixin.WeiXinAppStater;
import com.ahem.machine.weixin.service.RecordService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringApplicationConfiguration(WeiXinAppStater.class)
public class RecordTest {

	@Autowired
	private RecordService recordService;

	@Test
	public void test() {
		recordService.generateRecord(0);
	}

}