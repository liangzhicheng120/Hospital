package com.xinrui.hospital.service;

import java.util.List;

import com.xinrui.hospital.bean.Doctor;
import com.xinrui.hospital.bean.PageParam;

/**
 * @ClassName: IDoctorService
 * @Description: 医生表数据处理类
 * @author 梁志成
 * @date 2016年3月31日 上午12:21:11
 */
public interface IDoctorService
{
	
	/**
	 * 分页查询所有医生信息
	 */
	public List < Doctor > queryAllDoctorByPage ( PageParam pageParam , String hospital ,
			String city , String district );
	
	/**
	 * 批量更新审查状态
	 */
	public boolean updateBatch ( String [ ] ids );
	
	/**
	 * 批量删除
	 */
	public boolean deleteBatch ( String [ ] ids );
	
	/**
	 * 查询搜索栏城市字段
	 */
	public List < Doctor > queryDoctorCity ( );
	
	/**
	 * 查询搜索栏地区字段
	 */
	public List < Doctor > queryDoctorDistrict ( String city );
}
