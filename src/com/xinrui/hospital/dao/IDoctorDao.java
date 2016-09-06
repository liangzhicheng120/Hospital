package com.xinrui.hospital.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.xinrui.hospital.bean.Doctor;

/**
 * 
 * @ClassName: IDoctorDao
 * @Description: 医生表接口
 * @author 梁志成
 * @date 2016年3月31日 上午12:20:19
 *
 */
@Repository
public interface IDoctorDao
{

	// 分页查询医生信息
	public List<Doctor> queryAllDoctorByPage( Map<String, Object> parameter );

	// 批量更新审核状态
	public void updateBatch( List<Integer> ids );

	// 批量删除
	public void deleteBatch( List<Integer> ids );

	// 查询搜索栏城市字段
	public List<Doctor> queryDoctorCity();

	// 查询搜索栏地区字段
	public List<Doctor> queryDoctorDistrict( Doctor doctor );
}
