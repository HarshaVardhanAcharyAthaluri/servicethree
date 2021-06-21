package com.task.servicethree.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.task.servicethree.model.User;
import com.task.servicethree.service.UserService;

@RestController
public class UserController {

	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public ResponseEntity<String> saveUser(@RequestBody User user){
		log.info("{}",user);
		User savedUser = userService.saveUser(user);
		return new ResponseEntity<String>(savedUser.getName()+" "+savedUser.getSurName(),HttpStatus.OK);
	}
}
