package com.smartSector.UserCrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartSector.UserCrud.Model.User;
import com.smartSector.UserCrud.service.UserService;

@RestController
public class UserController
{
	@Autowired
	UserService us;
	
	@RequestMapping("/saveRDProject")
	public User save(@RequestBody User user)
	{
		return us.saveData(user);
		
	}
	

}
