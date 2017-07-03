package com.zhangtao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommonToolsApplicationTests {

	@Test
	public void contextLoads() {
		String srcStr = "待转/换字符/,串";
		String encodeStr = Hex.encodeHexStr(srcStr);
		String decodeStr = new String(Hex.decodeHex(encodeStr));
		System.out.println("转换前：" + srcStr);
		System.out.println("转换后：" + encodeStr);
		System.out.println("还原后：" + decodeStr);
	}

}
