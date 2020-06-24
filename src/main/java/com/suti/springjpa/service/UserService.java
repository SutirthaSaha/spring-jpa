package com.suti.springjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suti.springjpa.model.User;
import com.suti.springjpa.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getUsers(){
		return (List<User>) userRepository.findAll();
	}
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
}
