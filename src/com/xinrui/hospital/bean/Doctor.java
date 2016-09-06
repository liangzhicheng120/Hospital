package com.xinrui.hospital.bean;

import java.io.Serializable;

/**
 * 
 * @ClassName: Doctor
 * @Description: ҽ����
 * @author ��־��
 * @date 2016��3��31�� ����8:02:17
 *
 */
public class Doctor implements Serializable
{

	private static final long serialVersionUID = 1L;

	private int id;

	private String name;

	private int type;// ��ͬ���ֱ�ʾ��ͬ���͵�ҽ��

	/*
	 * ȫ��ҽ�� 1��ʿ 2����ʦ 3ҩ��ʦ 4ר��ҽ�� 5B��ʦ 6������ѯʦ 7Ӫ����ѯʦ8ר��ҽ�� 9���� 10
	 */
	private String ctype;

	/*
	 * ȫ��ҽ�� 1��ʿ 2����ʦ 3ҩ��ʦ 4ר��ҽ�� 5B��ʦ 6������ѯʦ 7Ӫ����ѯʦ8ר��ҽ�� 9���� 10
	 */

	private String phone;

	private String certificateNO;// ֤����

	private int sex;// 1 is boy,0 is girl

	private String csex; // 1 is boy,0 is girl

	private String city; // ����

	private String district; // ����

	private String hospital; // ҽԺ

	private String headpic;// ͷ��

	private Integer status; // 1:����� 0�� δ���

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
			return "��";
		}
		else if ( sex == 0 )
		{
			return "Ů";
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
		 * ȫ��ҽ�� 1��ʿ 2����ʦ 3ҩ��ʦ 4ר��ҽ�� 5B��ʦ 6������ѯʦ 7Ӫ����ѯʦ8ר��ҽ�� 9���� 10
		 */
		switch ( type )
		{
		case 1:
			return "ȫ��ҽ��";
		case 2:
			return "��ʿ";
		case 3:
			return "����ʦ";
		case 4:
			return "ҩ��ʦ";
		case 5:
			return "ר��ҽ��";
		case 6:
			return "B��ʦ";
		case 7:
			return "������ѯʦ";
		case 8:
			return "ר��ҽ��";
		case 9:
			return "Ӫ����ѯʦ";
		case 10:
			return "����";
		default:
			return null;
		}
	}

	public void setCtype( String ctype )
	{

		this.ctype = ctype;
	}

}
