package com.xinrui.hospital.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.xinrui.hospital.bean.Key;
import com.xinrui.hospital.bean.Url;
import com.xinrui.hospital.dto.Result;
import com.xinrui.hospital.service.LoginService;
import com.xinrui.hospital.util.Constants;

/**
 * 
 * @ClassName: LoginServiceImpl
 * @Description: 登陆接口实现类
 * @author 梁志成
 * @date 2016年5月23日 下午9:31:16
 *
 */
@Service
public class LoginServiceImpl implements LoginService
{
	// 加密盐值
	private final String SALT = "AJSDLKASDKA%^%&^*&(SKJDF123DFKLSJDF*&)";

	// 用户名
	private final String USERNAME = "admin";

	// 用户密码
	private final String PASSWORD = "12345feishu@com";

	// 验证用户是否登录
	public Result<Url> checkUser( String loginKey )
	{
		HttpServletRequest request = ( ( ServletRequestAttributes ) RequestContextHolder
				.getRequestAttributes() ).getRequest();

		if ( StringUtils.isNotEmpty( loginKey ) )
		{
			String key = getEncryptKey();

			if ( loginKey.equals( key ) )
			{
				Url url = new Url( "/Hospital/main" );
				request.getSession().setAttribute( Constants.ADMIN, "admin" );
				return new Result<Url>( true, url );
			}
			else
			{
				return new Result<Url>( false, "用户名或用户密码错误！" );
			}
		}
		else
		{
			return new Result<Url>( false, "用户名或用户密码错误！" );
		}
	}

	// 返回登陆秘钥
	public Key getLoginKey( String username, String password )
	{
		Key loginKey = new Key( getMd5( username, password ) );
		return loginKey;
	}

	// 加密值
	public String getEncryptKey()
	{
		String base = USERNAME + PASSWORD + "/" + SALT;
		String md5 = DigestUtils.md5DigestAsHex( base.getBytes() );
		return md5;
	}

	// 用户名加密处理
	private String getMd5( String username, String password )
	{
		String base = username + password + "/" + SALT;
		String md5 = DigestUtils.md5DigestAsHex( base.getBytes() );
		return md5;
	}
}
