package com.crud.service;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.User;
import com.crud.repository.AppRepository;

@Service
public class AppService {
	
	@Autowired
	AppRepository appRepository;
	

	public Object saveUser(User user) {
		// TODO Auto-generated method stub
	
			return appRepository.save(user);
			
		}

	public Object getById(int id) {
		// TODO Auto-generated method stub
		return appRepository.findById(id);
	}
	
	
	

	public Object deleteUserId(int id) {
		// TODO Auto-generated method stub
		appRepository.deleteById(id);
		return "Record deleted successfully";
	}

	public Object updateById(int id, User updateUser) {
		// TODO Auto-generated method stub
		User userData=(User) getById(id);
		
		if(userData!=null) {
			userData.setUsername(updateUser.getUsername());
			userData.setPassword(updateUser.getPassword());
			userData.setRole(updateUser.getRole());
			
			return appRepository.save(userData);
	}
		else {
			return "User doesn't exist"; }
		}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return (List<User>) appRepository.findAll();
	}
	}

	

	
	


