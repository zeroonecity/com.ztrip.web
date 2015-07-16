package com.ztrip.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ztrip.web.domain.Group;
import com.ztrip.web.repo.GroupRepository;

@Controller
public class GroupController {
	
	@Autowired
	private GroupRepository repository;
	
	@RequestMapping("/group/create")
	@ResponseBody
	public void create(){
		Group group = new Group();
		repository.save(group);
	}
}
