package com.xinrui.hospital.dto;

/**
 * 
 * @ClassName: Result
 * @Description: 返回结果对象
 * @author 梁志成
 * @date 2016年5月23日 下午9:26:13
 * 
 * @param <T>
 */
public class Result<T>
{

	private boolean success; // 是否成功

	private T data; // 返回的数据
 
	private String error; // 返回错误信息

	public Result( boolean success, String error )
	{
		this.success = success;
		this.error = error;
	}

	public Result( boolean success, T data )
	{
		this.success = success;
		this.data = data;
	}

	public boolean isSuccess()
	{
		return success;
	}

	public void setSuccess( boolean success )
	{
		this.success = success;
	}

	public T getData()
	{
		return data;
	}

	public void setData( T data )
	{
		this.data = data;
	}

	public String getError()
	{
		return error;
	}

	public void setError( String error )
	{
		this.error = error;
	}

}
