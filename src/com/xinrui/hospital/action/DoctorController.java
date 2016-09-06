package com.xinrui.hospital.action;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xinrui.hospital.bean.Doctor;
import com.xinrui.hospital.bean.PageParam;
import com.xinrui.hospital.service.IDoctorService;
import com.xinrui.hospital.util.PageparmUtil;

@Controller
@RequestMapping( value = "/main/doctor" )
public class DoctorController
{
	private final Logger logger = LoggerFactory.getLogger( this.getClass() );

	@Resource
	private IDoctorService doctorService;

	@RequestMapping( value = "" )
	public ModelAndView doctor( String currentPage, String hospital, String city, String district )
	{
		// ����ҽ��ҳ��
		ModelAndView mav = new ModelAndView( "frame/doctor" );
		// ���õ�ǰҳ��
		PageParam page = PageparmUtil.setCurrentPage( currentPage );
		List<Doctor> optionCity = doctorService.queryDoctorCity();
		List<Doctor> optionDistrict = doctorService.queryDoctorDistrict( city );
		List<Doctor> doctors = doctorService.queryAllDoctorByPage( page, hospital, city, district );
		logger.info( "ҽ�����ƽ̨��ǰҳ����" + page.getCurrentPage() );
		logger.info( "ҽ�����ƽ̨��ѯ���У�" + city );
		logger.info( "ҽ�����ƽ̨��ѯ������" + district );
		// ���ز�ѯ���
		mav.addObject( "doctor", doctors );
		mav.addObject( "page", page );
		mav.addObject( "hospital", hospital );
		mav.addObject( "optionCity", optionCity );
		mav.addObject( "optionDistrict", optionDistrict );
		mav.addObject( "city", city );
		mav.addObject( "district", district );

		return mav;
	}
}
