package com.xinrui.hospital.util;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: BytesToStringUtil
 * @Description: 字符串工具类
 * @author 梁志成
 * @date 2016年3月19日 下午8:42:24
 *
 */
public class StringUtil
{
	
	/**
	 * 字节数组转换为字符串
	 */
	public static String fromBytesToString ( byte [ ] resultBytes )
	{
	
		StringBuilder builder = new StringBuilder ( );
		for ( int i = 0 ; i < resultBytes.length ; i ++ )
		{
			if ( Integer.toHexString ( 0xFF & resultBytes [ i ] ).length ( ) == 1 )
			{
				builder.append ( "0" ).append ( Integer.toHexString ( 0xFF & resultBytes [ i ] ) );
			}
			else
			{
				builder.append ( Integer.toHexString ( 0xFF & resultBytes [ i ] ) );
			}
		}
		return builder.toString ( );
	}
	
	/**
	 * 字符串数字装换成整型列表集合
	 */
	public static List < Integer > fromStringToInteger ( String [ ] ids )
	{
	
		List < Integer > idList = new ArrayList < Integer > ( );
		for ( String id : ids )
		{
			idList.add ( Integer.valueOf ( id ) );
		}
		
		return idList;
	}
	
}
