package com.xinrui.hospital.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping( value = "/main" )
public class Miancontroller
{
	@RequestMapping( value = "", method = RequestMethod.GET )
	public String main()
	{
		return "frame/main";
	}
}
