package com.xinrui.hospital.service;

import java.util.List;

import com.xinrui.hospital.bean.Doctor;
import com.xinrui.hospital.bean.PageParam;

/**
 * @ClassName: IDoctorService
 * @Description: ҽ�������ݴ�����
 * @author ��־��
 * @date 2016��3��31�� ����12:21:11
 */
public interface IDoctorService
{
	
	/**
	 * ��ҳ��ѯ����ҽ����Ϣ
	 */
	public List < Doctor > queryAllDoctorByPage ( PageParam pageParam , String hospital ,
			String city , String district );
	
	/**
	 * �����������״̬
	 */
	public boolean updateBatch ( String [ ] ids );
	
	/**
	 * ����ɾ��
	 */
	public boolean deleteBatch ( String [ ] ids );
	
	/**
	 * ��ѯ�����������ֶ�
	 */
	public List < Doctor > queryDoctorCity ( );
	
	/**
	 * ��ѯ�����������ֶ�
	 */
	public List < Doctor > queryDoctorDistrict ( String city );
}
