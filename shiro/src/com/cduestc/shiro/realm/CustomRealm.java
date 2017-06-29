package com.cduestc.shiro.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class CustomRealm extends AuthorizingRealm {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "customRealm";
	}


	// 用于认证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		// token是用户输入的
		
		// 从token中取出身份信息
		String userCode = (String) token.getPrincipal();
		
		// 根据用户输入的userCode从数据库中查询
		//  ...
		String password = "1111";
		
		// 如果查询不到返回null
		
		// 如果查询到则返回认证信息AuthenticationInfo
		
		SimpleAuthenticationInfo sa = new SimpleAuthenticationInfo(userCode, password, this.getName());
		
		return sa;
	}
	
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {

		
		
		
		
		
		return null;
	}



}
