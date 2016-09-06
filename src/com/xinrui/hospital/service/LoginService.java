package com.xinrui.hospital.service;

import com.xinrui.hospital.bean.Key;
import com.xinrui.hospital.bean.Url;
import com.xinrui.hospital.dto.Result;

/**
 * 
 * @ClassName: LoginService
 * @Description: 登陆验证接口
 * @author 梁志成
 * @date 2016年5月23日 下午9:30:05
 *
 */
public interface LoginService
{
	// 用户登录
	public Key getLoginKey( String username, String password );

	// 加密信息
	public String getEncryptKey();

	// 验证用户登录
	public Result<Url> checkUser( String loginKey );
}
