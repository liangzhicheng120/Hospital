package com.xinrui.hospital.util;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: BytesToStringUtil
 * @Description: �ַ���������
 * @author ��־��
 * @date 2016��3��19�� ����8:42:24
 *
 */
public class StringUtil
{
	
	/**
	 * �ֽ�����ת��Ϊ�ַ���
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
	 * �ַ�������װ���������б���
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
