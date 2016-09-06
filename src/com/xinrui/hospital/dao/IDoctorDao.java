package com.xinrui.hospital.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.xinrui.hospital.bean.Doctor;

/**
 * 
 * @ClassName: IDoctorDao
 * @Description: ҽ����ӿ�
 * @author ��־��
 * @date 2016��3��31�� ����12:20:19
 *
 */
@Repository
public interface IDoctorDao
{

	// ��ҳ��ѯҽ����Ϣ
	public List<Doctor> queryAllDoctorByPage( Map<String, Object> parameter );

	// �����������״̬
	public void updateBatch( List<Integer> ids );

	// ����ɾ��
	public void deleteBatch( List<Integer> ids );

	// ��ѯ�����������ֶ�
	public List<Doctor> queryDoctorCity();

	// ��ѯ�����������ֶ�
	public List<Doctor> queryDoctorDistrict( Doctor doctor );
}
