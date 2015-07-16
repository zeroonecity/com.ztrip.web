package com.ztrip.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ztrip.web.domain.Role;
import com.ztrip.web.repo.RoleRepository;

@Controller
public class RoleController {

	@Autowired
	private RoleRepository repository;
	
	@RequestMapping("/role/create")
	@ResponseBody
	public void create(){
		Role role = new Role();
		repository.save(role);
	}
}
