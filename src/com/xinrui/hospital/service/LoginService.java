package com.xinrui.hospital.service;

import com.xinrui.hospital.bean.Key;
import com.xinrui.hospital.bean.Url;
import com.xinrui.hospital.dto.Result;

/**
 * 
 * @ClassName: LoginService
 * @Description: ��½��֤�ӿ�
 * @author ��־��
 * @date 2016��5��23�� ����9:30:05
 *
 */
public interface LoginService
{
	// �û���¼
	public Key getLoginKey( String username, String password );

	// ������Ϣ
	public String getEncryptKey();

	// ��֤�û���¼
	public Result<Url> checkUser( String loginKey );
}
