package com.arisglobal.entity;

import javax.persistence.*;

@Entity
@Table(name = "lms_user")
public class User {
	@Id
	private int id;
	@Column(name = "user_name")
	private String user_name;
	@Column(name = "address")
	private String address;
	@Column(name = "role_id")
	private int role_id;
	@Column(name = "email")
	private String email;
	@Column(name = "mobile_number")
	private long mobile_number;
	@Column(name = "password")
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", user_name=" + user_name + ", address=" + address + ", role_id=" + role_id
				+ ", email=" + email + ", mobile_number=" + mobile_number + ", password=" + password + "]";
	}

	public User(int id, String user_name, String address, int role_id, String email, long mobile_number,
			String password) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.address = address;
		this.role_id = role_id;
		this.email = email;
		this.mobile_number = mobile_number;
		this.password = password;
	}

	public User() {
		super();
	}
}
