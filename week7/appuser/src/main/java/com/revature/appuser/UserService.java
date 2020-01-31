package com.revature.appuser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> getAll() {
		return userRepository.findAll();
	}
	
	public Integer register(String username, String password) {
		User u = new User();
		u.setUsername(username);
		u.setPassword(password);
		return userRepository.save(u).getId();
	}
	
	public Boolean isValid(String username, String password) {
		List<User> users = userRepository.findByUsername(username);
		if(users.size() == 0) {
			return false;
		}
		for(User u : users) {
			if(u.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	public Boolean isValidTwo(String username, String password) {
		return (userRepository.checkIfValid(username, password).size() > 0);
	}
	
}
