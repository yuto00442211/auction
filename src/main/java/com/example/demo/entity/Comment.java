package com.example.demo.entity;

import lombok.Data;

@Data
public class Account {

	private Integer account_id;
	private String name;
	private String address;
	private String tel;
	private String mail;
	private String password;
}