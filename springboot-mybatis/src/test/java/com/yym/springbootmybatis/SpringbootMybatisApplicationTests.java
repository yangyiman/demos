package com.yym.springbootmybatis;

import com.yym.springbootmybatis.encrypt.Base64Encrypt;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {

	@Test
	public void contextLoads() {
		String str = "hello world java is best language in the world {\"button\":[{\"type\":\"click\",\"name\":\"歌曲ququ\",\"key\":\"V1001_TODAY_MUSIC\"},{\"name\":\"菜单\",\"sub_button\":[{\"type\":\"view\",\"name\":\"搜索\",\"url\":\"http://www.soso.com/\"},{\"type\":\"miniprogram\",\"name\":\"wxa\",\"url\":\"http://mp.weixin.qq.com\",\"appid\":\"wx286b93c14bbf93aa\",\"pagepath\":\"pages/lunar/index\"},{\"type\":\"click\",\"name\":\"赞一下我们\",\"key\":\"V1001_GOOD\"}]}]}";
		String s = Base64Encrypt.base64Encode(str);
		System.out.println("加密: "+s);
		String s1 = Base64Encrypt.base64Decode(s);
		System.out.println("解密: "+s1);
	}

}
