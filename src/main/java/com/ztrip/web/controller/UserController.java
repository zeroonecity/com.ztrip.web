package com.ztrip.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ztrip.web.domain.User;
import com.ztrip.web.repo.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/user/create")
	@ResponseBody
	public User list() {
		User user = new User();
		user.setFirstName("First");
		user.setLastName("Last");
		user.setEmail("buyris@163.com");
		user.setUserName("moreus");
		user.setMobile("86013816390847");
		User one = userRepository.save(user);
		return one;
	}
}
