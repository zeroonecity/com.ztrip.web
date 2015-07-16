package com.ztrip.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ztrip.web.domain.Permission;
import com.ztrip.web.repo.PermissionRepository;

@Controller
public class PerimissionController {

	@Autowired
	private PermissionRepository repository;
	
	@RequestMapping("/permission/create")
	@ResponseBody
	public void create(){
		Permission permission = new Permission();
		repository.save(permission);
	}
}
