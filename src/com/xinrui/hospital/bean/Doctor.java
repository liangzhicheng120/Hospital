package com.xinrui.hospital.bean;

import java.io.Serializable;

/**
 * 
 * @ClassName: Doctor
 * @Description: 医生表
 * @author 梁志成
 * @date 2016年3月31日 下午8:02:17
 *
 */
public class Doctor implements Serializable
{

	private static final long serialVersionUID = 1L;

	private int id;

	private String name;

	private int type;// 不同数字表示不同类型的医生

	/*
	 * 全科医生 1护士 2康复师 3药剂师 4专科医生 5B超师 6心理咨询师 7营养咨询师8专科医生 9其他 10
	 */
	private String ctype;

	/*
	 * 全科医生 1护士 2康复师 3药剂师 4专科医生 5B超师 6心理咨询师 7营养咨询师8专科医生 9其他 10
	 */

	private String phone;

	private String certificateNO;// 证书编号

	private int sex;// 1 is boy,0 is girl

	private String csex; // 1 is boy,0 is girl

	private String city; // 城市

	private String district; // 地区

	private String hospital; // 医院

	private String headpic;// 头像

	private Integer status; // 1:已审核 0： 未审核

	public String getCity()
	{

		return city;
	}

	public void setCity( String city )
	{

		this.city = city;
	}

	public String getDistrict()
	{

		return district;
	}

	public void setDistrict( String district )
	{

		this.district = district;
	}

	public String getHospital()
	{

		return hospital;
	}

	public void setHospital( String hospital )
	{

		this.hospital = hospital;
	}

	public Integer getStatus()
	{

		return status;
	}

	public void setStatus( Integer status )
	{

		this.status = status;
	}

	public String getHeadpic()
	{

		return headpic;
	}

	public void setHeadpic( String headpic )
	{

		this.headpic = headpic;
	}

	public int getId()
	{

		return id;
	}

	public void setId( int id )
	{

		this.id = id;
	}

	public String getName()
	{

		return name;
	}

	public void setName( String name )
	{

		this.name = name;
	}

	public int getType()
	{

		return type;
	}

	public void setType( int type )
	{

		this.type = type;
	}

	public String getPhone()
	{

		return phone;
	}

	public void setPhone( String phone )
	{

		this.phone = phone;
	}

	public String getCertificateNO()
	{

		return certificateNO;
	}

	public void setCertificateNO( String certificateNO )
	{

		this.certificateNO = certificateNO;
	}

	public int getSex()
	{

		return sex;
	}

	public void setSex( int sex )
	{

		this.sex = sex;
	}

	public String getCsex()
	{

		if ( sex == 1 )
		{
			return "男";
		}
		else if ( sex == 0 )
		{
			return "女";
		}
		else
		{
			return null;
		}
	}

	public void setCsex( String csex )
	{

		this.csex = csex;
	}

	public String getCtype()
	{

		/*
		 * 全科医生 1护士 2康复师 3药剂师 4专科医生 5B超师 6心理咨询师 7营养咨询师8专科医生 9其他 10
		 */
		switch ( type )
		{
		case 1:
			return "全科医生";
		case 2:
			return "护士";
		case 3:
			return "康复师";
		case 4:
			return "药剂师";
		case 5:
			return "专科医生";
		case 6:
			return "B超师";
		case 7:
			return "心理咨询师";
		case 8:
			return "专科医生";
		case 9:
			return "营养咨询师";
		case 10:
			return "其他";
		default:
			return null;
		}
	}

	public void setCtype( String ctype )
	{

		this.ctype = ctype;
	}

}
