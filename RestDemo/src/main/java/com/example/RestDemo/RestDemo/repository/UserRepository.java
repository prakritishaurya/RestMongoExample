package com.example.RestDemo.RestDemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.RestDemo.RestDemo.entity.UserEntity;


@Repository
public interface UserRepository extends MongoRepository<UserEntity, Integer>{

	public UserEntity findByUserIdAndAgeAndGender(int userId, int age, String gender);

	
}
