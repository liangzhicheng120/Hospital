package com.xinrui.hospital.bean;

/**
 * 
 * @ClassName: Key
 * @Description: 验证秘钥
 * @author 梁志成
 * @date 2016年5月23日 下午10:32:17
 *
 */
public class Key
{
	private String key;

	public Key( String key )
	{
		this.key = key;
	}

	public String getKey()
	{
		return key;
	}

	public void setKey( String key )
	{
		this.key = key;
	}

	public String toString()
	{
		return "Key [key=" + key + "]";
	}

}
