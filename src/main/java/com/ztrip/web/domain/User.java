package com.ztrip.web.domain;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 20)
	private String firstName;

	@Column(nullable = false, length = 20)
	private String lastName;

	@Column(nullable = false, length = 40)
	private String email;

	@Column(nullable = false, length = 20)
	private String userName;

	@Column(nullable = false, length = 15)
	private String mobile;
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return firstName + "-" + lastName;
	}
}
