package com.task.servicethree.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.servicethree.exception.UserException;
import com.task.servicethree.model.User;

@Service
public class UserService {

	private static final Logger log = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private User user;
	
	
	public User saveUser(User payloaduser) {
		log.info("{}","Name: "+payloaduser.getName());
		if(payloaduser.getName()==null||payloaduser.getName()=="") 
			throw new UserException("please provide name");
		
		log.info("{}","SurName: "+payloaduser.getSurName());
		if(payloaduser.getSurName()==null||payloaduser.getName()=="")
			throw new UserException("please provide surname");
			log.info("{}","setting username");
			user.setName(payloaduser.getName());
			log.info("{}","setting surname");
			user.setSurName(payloaduser.getSurName());
		
		return user;
	}
}
