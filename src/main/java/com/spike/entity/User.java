package com.spike.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//@Entity
//@Table(name = "mmb_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "person_id")
	private Long id;
	//@Column(name = "First_name")
	private String name;
	//@Column(name = "First_name")
	private String FirstName;
	//@Column(name = "last_name")
	private String LastName;
	//@Column(name = "user_name")
	private String userName;
	//@Column(name = "email")
	private String email;
	//@Column(name = "pwd")
	private String password;
	//@Column(name = "mobile_num")
	private String MobileNum;
	//@Column(name = "userType")
	private String userType;
	//@Column(name = "status")
	private char status;

}
