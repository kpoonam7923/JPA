package com.myjpa.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myjpa.demo.*;
import com.myjpa.demo.dao.EmpRepo;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	EmpRepo repo;

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/addData")
	public String add(Employee emp) 
	{
		repo.save(emp);
		return "home.jsp";
	}
}
