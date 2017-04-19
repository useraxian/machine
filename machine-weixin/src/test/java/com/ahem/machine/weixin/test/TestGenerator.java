package com.ahem.machine.weixin.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ahem.machine.weixin.WeiXinAppStater;
import com.ahem.machine.weixin.core.MaxGenerator;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringApplicationConfiguration(WeiXinAppStater.class)
public class TestGenerator {
	@Autowired
	MaxGenerator generator;
	
	@Test
	public void test() {
		generator.generate(255);
	}

}
