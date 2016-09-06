package com.xinrui.hospital.bean;

/**
 * 
 * @ClassName: Url
 * @Description: 返回地址信息
 * @author 梁志成
 * @date 2016年5月24日 上午12:28:24
 *
 */
public class Url
{
	private String url;

	public String getUrl()
	{
		return url;
	}

	public void setUrl( String url )
	{
		this.url = url;
	}

	public String toString()
	{
		return "Url [url=" + url + "]";
	}

	public Url( String url )
	{
		this.url = url;
	}

}
