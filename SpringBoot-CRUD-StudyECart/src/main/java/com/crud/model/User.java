package com.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="user")
@Getter
@Setter
public class User {
	
	@Id
	private int id;
	private String username;
	private String password;
	private String role;

}
