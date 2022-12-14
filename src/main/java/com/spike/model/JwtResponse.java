package com.spike.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JwtResponse {
	private String jwt;
	private Long id;
	private String username;
	private String email;
	private List<String> roles;
	private String tokenType;

}
