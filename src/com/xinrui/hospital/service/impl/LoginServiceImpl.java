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
 * @Description: ��½�ӿ�ʵ����
 * @author ��־��
 * @date 2016��5��23�� ����9:31:16
 *
 */
@Service
public class LoginServiceImpl implements LoginService
{
	// ������ֵ
	private final String SALT = "AJSDLKASDKA%^%&^*&(SKJDF123DFKLSJDF*&)";

	// �û���
	private final String USERNAME = "admin";

	// �û�����
	private final String PASSWORD = "12345feishu@com";

	// ��֤�û��Ƿ��¼
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
				return new Result<Url>( false, "�û������û��������" );
			}
		}
		else
		{
			return new Result<Url>( false, "�û������û��������" );
		}
	}

	// ���ص�½��Կ
	public Key getLoginKey( String username, String password )
	{
		Key loginKey = new Key( getMd5( username, password ) );
		return loginKey;
	}

	// ����ֵ
	public String getEncryptKey()
	{
		String base = USERNAME + PASSWORD + "/" + SALT;
		String md5 = DigestUtils.md5DigestAsHex( base.getBytes() );
		return md5;
	}

	// �û������ܴ���
	private String getMd5( String username, String password )
	{
		String base = username + password + "/" + SALT;
		String md5 = DigestUtils.md5DigestAsHex( base.getBytes() );
		return md5;
	}
}
