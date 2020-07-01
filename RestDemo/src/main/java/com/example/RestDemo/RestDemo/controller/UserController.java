package com.example.RestDemo.RestDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestDemo.RestDemo.model.User;
import com.example.RestDemo.RestDemo.service.UserService;


@RestController
public class UserController {
	@Autowired 
	private UserService userService;
	
	@GetMapping("/healthStatus")
	public Health checkStatus() {
		return new HealthCheck().health();
	}
	
	@GetMapping("/getAll")
	public List<User> getAll(){
		return userService.getAll();
	}
	
	@PostMapping(path="/addUser",consumes="application/json", produces = "application/json")
	public String addUser(@RequestBody User user) {
		String message =null;
		try {
			System.out.print(user.getUserId());
		message= userService.addUser(user);
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
		return message;
	}
	
	@GetMapping(path="/getUser", produces = "application/json")
	public User getUserByUserIdAndAgeAndGender(@RequestParam int userId, @RequestParam int age, @RequestParam String gender) {
		return userService.getByIdAndAgeAndGender(userId, age, gender);
	}
}
