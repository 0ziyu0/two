package com.cduesc.mds;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Test;

public class TestMd5 {

	@Test
	public void testMD5() {
		
		// 原始密码
		String source = "1111";
		// 盐
		String salt = "ziyu";
		// 散列
		int hashIterations = 2;
		
		// 第一个参数：明文，原始密码
		// 第二个参数：盐，通过使用随机数
		// 第三个参数：散列次数，比如两次，相当于 md5(md5(''));
		Md5Hash md5Hash = new Md5Hash(source, salt, hashIterations);
		
		String pass_md5 = md5Hash.toString();
		System.out.println(pass_md5);
		// 一次： cea15b5c7ade70f25f97ffe40e96aa14
		// 二次: 775f0ebfd4dc4fcc0f49348383660e60
		
		// 散列算法
		SimpleHash hash = new SimpleHash("md5", source, salt, hashIterations);
		System.out.println(hash.toString());
		
	}
}









