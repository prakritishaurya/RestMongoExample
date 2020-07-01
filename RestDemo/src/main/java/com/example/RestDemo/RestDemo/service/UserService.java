package com.example.RestDemo.RestDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestDemo.RestDemo.entity.UserEntity;
import com.example.RestDemo.RestDemo.exception.UserIdAlreadyPresentException;
import com.example.RestDemo.RestDemo.model.User;
import com.example.RestDemo.RestDemo.repository.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public String addUser(User user) throws UserIdAlreadyPresentException{
		boolean u = userRepository.existsById(user.getUserId());
		if(u)
			throw new UserIdAlreadyPresentException("RegistrationService.USERID_PRESENT");
		UserEntity ue = new UserEntity();
		ue.setUserId(user.getUserId());
		ue.setAge(user.getAge());
		ue.setFirstName(user.getFirstName());
		ue.setLastName(user.getLastName());
		ue.setGender(user.getGender());
		userRepository.save(ue);
		return "User successfully added.";
	}
	
	public List<User> getAll(){
		List<UserEntity> ue = userRepository.findAll();
		List<User> userList = new ArrayList<User>();
		for(UserEntity user: ue) {
			User u = new User();
			u.setUserId(user.getUserId());
			u.setAge(user.getAge());
			u.setFirstName(user.getFirstName());
			u.setLastName(user.getLastName());
			u.setGender(user.getGender());
			userList.add(u);
		}
		//System.out.print("Testing Data:"+ userList);
		return userList;
	}

	public User getByIdAndAgeAndGender(int userId, int age, String gender) {
		UserEntity ue = userRepository.findByUserIdAndAgeAndGender(userId, age, gender);
		User user = new User();
		user.setUserId(ue.getUserId());
		user.setAge(ue.getAge());
		user.setFirstName(ue.getFirstName());
		user.setLastName(ue.getLastName());
		user.setGender(ue.getGender());
		return user;
	}
}
