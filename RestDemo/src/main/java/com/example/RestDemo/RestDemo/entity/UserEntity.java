package com.example.RestDemo.RestDemo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user")
public class UserEntity {

		@Id
		private int userId;
		private int age;
		private String firstName;
		private String lastName;
		private String gender;
		
		public UserEntity() {
			
		}	
		public UserEntity(int userId, int age, String firstName, String lastName, String gender) {
			super();
			this.userId = userId;
			this.age = age;
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
		}

		public int getUserId() {
			return userId;
		}
		
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		
}
