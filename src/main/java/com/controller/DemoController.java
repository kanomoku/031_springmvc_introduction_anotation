package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//二.SpringMVC 环境搭建
//1. 导入jar
//2. 在web.xml 中配置前端控制器DispatcherServlet
//	2.1 如果不配置<init-param> 会在/WEB-INF/找<servlet-name>-servlet.xml这个文件
//3. 在src 下新建springmvc.xml
//	3.1 引入xmlns:mvc 命名空间
//4. 编写控制器类
@Controller
public class DemoController {
	@RequestMapping("demo")
	public String demo() {
		System.out.println("执行代码");
		return "main.jsp";
	}
	@RequestMapping("demo2")
	public String demo2() {
		System.out.println("执行代码2");
		return "main2.jsp";
	}
}
