package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.bean.EmployeeBean;
import com.example.demo.dao.EmployeeRepository;

@Controller
public class SpringBootJpaController {

	@Autowired
	EmployeeRepository empRepo;
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("/addEmp")
	public String addEmp(EmployeeBean empBean) {
		empRepo.save(empBean);
		return "index.jsp";
		
	}
	
	@RequestMapping("/getByTech/{tech}")
	@ResponseBody
	public List<EmployeeBean> findByTech(@PathVariable String tech) {
		
		System.out.println(":::: 1 " + empRepo.findByTech(tech));
		
		System.out.println(":::: 2 " + empRepo.findAllByTech(tech));
		
		
		return empRepo.findAllByTech(tech);
		
		
	}
}
