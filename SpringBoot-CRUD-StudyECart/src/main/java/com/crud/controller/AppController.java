package com.crud.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.User;
import com.crud.service.AppService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AppController {
	
	@Autowired
	private AppService appService;
	
	//CREATE
	@PostMapping("/post")
	Object saveNewUser(@RequestBody User user) {
		return appService.saveUser(user);
		
	}
	
	//Retrieve
	@GetMapping("/get/{id}")
	Object getUserById(@PathVariable int id) {
		return appService.getById(id);
	}
	
	//Get all
		@GetMapping("/users")
		public List<User> getUsers(){
			
			return appService.findAll();
		}
	

	
	//Delete
	@DeleteMapping("/delete/{id}")
	Object deleteUserById(@PathVariable int id) {
		return appService.deleteUserId(id);
		
	}
	
	//Update
	@PutMapping("/update/{id}")
	Object updateById(@PathVariable ("id") int id, @RequestBody User updateUser) {
	
		return appService.updateById(id, updateUser);
	}

}