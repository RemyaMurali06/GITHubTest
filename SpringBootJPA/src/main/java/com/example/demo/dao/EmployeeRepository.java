package com.example.demo.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.bean.EmployeeBean;

public interface EmployeeRepository extends JpaRepository<EmployeeBean, String> {

	List<EmployeeBean> findByTech(String tech);

	List<EmployeeBean> findAllByTech(String tech);

	EmployeeBean findByName(String name);
	
}
