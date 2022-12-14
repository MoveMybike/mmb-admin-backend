package com.spike.model;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SignupRequest {
	private String firstname;
	private String lastname;
	private String username;
	private String email;
	private String mobilenum;
	private String password;
	private Set<String> role = new HashSet<>();
}
