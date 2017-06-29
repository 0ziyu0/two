package com.cduestc.shiro.authentication;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.apache.shiro.mgt.SecurityManager;
import org.junit.Test;

public class Authentication {


	@Test
	public void testLoginAndLogout() {
		
		// 创建securityManager工厂，通过ini配置文件创建securityManager工厂
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-first.ini");
		
		// 创建SecurityManager
		SecurityManager securityManager = factory.getInstance();
		
		// 将securityManager设置到当前的运行环境中
		SecurityUtils.setSecurityManager(securityManager);
		
		// 从SecurityUtils中创建一个subject
		Subject subject = SecurityUtils.getSubject();
		
		// 执行认证提交前准备token
		UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");
		
		// 执行认证提交
		try {
			subject.login(token);
		} catch (AuthenticationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 是否认证通过
		boolean authenticated = subject.isAuthenticated();
		System.out.println("shiro:  " + authenticated);
		
		// 退出操作
		subject.logout();
		
		authenticated = subject.isAuthenticated();
		System.out.println("shiro:  " + authenticated);
	}
	
	@Test
	public void testCustomRealm() {
		
		// 创建securityManager工厂，通过ini配置文件创建securityManager工厂
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-realm.ini");
		
		// 创建SecurityManager
		SecurityManager securityManager = factory.getInstance();
		
		// 将securityManager设置到当前的运行环境中
		SecurityUtils.setSecurityManager(securityManager);
		
		// 从SecurityUtils中创建一个subject
		Subject subject = SecurityUtils.getSubject();
		
		// 执行认证提交前准备token
		UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");
		
		// 执行认证提交
		try {
			subject.login(token);
		} catch (AuthenticationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 是否认证通过
		boolean authenticated = subject.isAuthenticated();
		System.out.println("shiro:  " + authenticated);
		
		// 退出操作
		subject.logout();
		
		authenticated = subject.isAuthenticated();
		System.out.println("shiro:  " + authenticated);
	}
	
	@Test
	public void testCustomRealmMD5() {
		
		// 创建securityManager工厂，通过ini配置文件创建securityManager工厂
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-realm-md5.ini");
		
		// 创建SecurityManager
		SecurityManager securityManager = factory.getInstance();
		
		// 将securityManager设置到当前的运行环境中
		SecurityUtils.setSecurityManager(securityManager);
		
		// 从SecurityUtils中创建一个subject
		Subject subject = SecurityUtils.getSubject();
		
		// 执行认证提交前准备token
		UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");
		
		// 执行认证提交
		try {
			subject.login(token);
		} catch (AuthenticationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 是否认证通过
		boolean authenticated = subject.isAuthenticated();
		System.out.println("shiro:  " + authenticated);
		
		// 退出操作
		subject.logout();
		
		authenticated = subject.isAuthenticated();
		System.out.println("shiro:  " + authenticated);
	}
}














