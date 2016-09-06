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
 * @Description: 医生表数据处理类
 * @author 梁志成
 * @date 2016年3月31日 上午8:42:51
 *
 */
@Service
public class DoctorServiceImpl implements IDoctorService
{

	@Resource
	private IDoctorDao doctorDao;

	/**
	 * 分页查询所有医生信息
	 */
	public List<Doctor> queryAllDoctorByPage( PageParam pageParam, String hospital, String city,
			String district )
	{

		Map<String, Object> parameter = new HashMap<String, Object>();

		// 设置查询信息
		Doctor doctor = new Doctor();
		doctor.setHospital( hospital );
		doctor.setCity( city );
		doctor.setDistrict( district );
		// 设置查询页数
		parameter.put( "pageParam", pageParam );
		// 设置查询的地区
		parameter.put( "doctor", doctor );
		// 返回分页结果
		return this.doctorDao.queryAllDoctorByPage( parameter );

	}

	/**
	 * 批量同意
	 */
	public boolean updateBatch( String[] ids )
	{

		List<Integer> idList = StringUtil.fromStringToInteger( ids );

		// id不为空,审核医生通过
		if ( CollectionUtils.isNotEmpty( idList ) )
		{
			this.doctorDao.updateBatch( idList );
			return true;
		}

		// 批量审核失败
		return false;
	}

	/**
	 * 批量删除
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
	 * 查询搜索栏城市字段
	 */
	public List<Doctor> queryDoctorCity()
	{

		return this.doctorDao.queryDoctorCity();
	}

	/**
	 * 查询搜索栏地区字段
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
