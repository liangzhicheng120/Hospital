package com.xinrui.hospital.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.xinrui.hospital.bean.Doctor;
import com.xinrui.hospital.bean.PageParam;
import com.xinrui.hospital.dao.IDoctorDao;
import com.xinrui.hospital.service.IDoctorService;
import com.xinrui.hospital.util.StringUtil;

/**
 * 
 * @ClassName: DoctorServiceImpl
 * @Description: ҽ�������ݴ�����
 * @author ��־��
 * @date 2016��3��31�� ����8:42:51
 *
 */
@Service
public class DoctorServiceImpl implements IDoctorService
{

	@Resource
	private IDoctorDao doctorDao;

	/**
	 * ��ҳ��ѯ����ҽ����Ϣ
	 */
	public List<Doctor> queryAllDoctorByPage( PageParam pageParam, String hospital, String city,
			String district )
	{

		Map<String, Object> parameter = new HashMap<String, Object>();

		// ���ò�ѯ��Ϣ
		Doctor doctor = new Doctor();
		doctor.setHospital( hospital );
		doctor.setCity( city );
		doctor.setDistrict( district );
		// ���ò�ѯҳ��
		parameter.put( "pageParam", pageParam );
		// ���ò�ѯ�ĵ���
		parameter.put( "doctor", doctor );
		// ���ط�ҳ���
		return this.doctorDao.queryAllDoctorByPage( parameter );

	}

	/**
	 * ����ͬ��
	 */
	public boolean updateBatch( String[] ids )
	{

		List<Integer> idList = StringUtil.fromStringToInteger( ids );

		// id��Ϊ��,���ҽ��ͨ��
		if ( CollectionUtils.isNotEmpty( idList ) )
		{
			this.doctorDao.updateBatch( idList );
			return true;
		}

		// �������ʧ��
		return false;
	}

	/**
	 * ����ɾ��
	 */
	public boolean deleteBatch( String[] ids )
	{

		List<Integer> idList = StringUtil.fromStringToInteger( ids );

		if ( CollectionUtils.isNotEmpty( idList ) )
		{
			this.doctorDao.deleteBatch( idList );
			return true;

		}
		return false;
	}

	/**
	 * ��ѯ�����������ֶ�
	 */
	public List<Doctor> queryDoctorCity()
	{

		return this.doctorDao.queryDoctorCity();
	}

	/**
	 * ��ѯ�����������ֶ�
	 */
	public List<Doctor> queryDoctorDistrict( String city )
	{

		if ( StringUtils.isNotEmpty( city ) )
		{
			Doctor doctor = new Doctor();
			doctor.setCity( city );
			return this.doctorDao.queryDoctorDistrict( doctor );
		}
		return null;
	}
}
