package com.amit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amit.entity.User;
import com.amit.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo uRepo;
	
	public void saveUser(User user) {
		uRepo.save(user);
	}

}
