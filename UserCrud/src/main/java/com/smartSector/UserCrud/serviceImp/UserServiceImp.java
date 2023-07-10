package com.smartSector.UserCrud.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartSector.UserCrud.Model.User;
import com.smartSector.UserCrud.repository.UserRepository;
import com.smartSector.UserCrud.service.UserService;

@Service
public class UserServiceImp implements UserService 
{
	@Autowired
	UserRepository ur;

	@Override
	public User saveData(User user) 
	{
	
		return ur.save(user);
	}
	

}
