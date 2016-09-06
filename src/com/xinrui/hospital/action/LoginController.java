package com.xinrui.hospital.action;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xinrui.hospital.bean.Key;
import com.xinrui.hospital.bean.Url;
import com.xinrui.hospital.dto.Result;
import com.xinrui.hospital.service.LoginService;

@Controller
@RequestMapping( value = "/login" )
public class LoginController
{

	private final Logger logger = LoggerFactory.getLogger( this.getClass() );

	@Resource
	private LoginService loginService;

	/**
	 * 返回登陆页面
	 * 
	 * @return
	 */
	@RequestMapping( value = "" )
	public String login()
	{
		return "login/login";
	}

	/**
	 * 用户和登陆
	 * 
	 * @param loginKey
	 */
	@RequestMapping( value = "/dologin", method = RequestMethod.POST, produces = { "application/json;charset=UTF-8" } )
	@ResponseBody
	public Result<Url> dologin( String loginKey )
	{
		logger.info( "loginKey=" + loginKey );
		return loginService.checkUser( loginKey );

	}

	/**
	 * 获取登陆秘钥
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping( value = "/getLoginKey", method = RequestMethod.POST, produces = { "application/json;charset=UTF-8" } )
	@ResponseBody
	public Result<Key> getLoginKey( String username, String password )
	{
		Key loginKey = loginService.getLoginKey( username, password );

		if ( loginKey != null )
		{
			return new Result<Key>( true, loginKey );
		}
		else
		{
			return new Result<Key>( false, "非法登陆！" );
		}

	}
}
