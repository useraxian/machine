package com.ahem.machine.weixin.test;

import org.junit.Test;

import com.ahem.common.utils.EmojiFilterUtil;

public class TestEmoji {


	@Test
	public void test() {
		String source="我🔥";
		System.out.println(EmojiFilterUtil.filterEmoji(source));
	}

}