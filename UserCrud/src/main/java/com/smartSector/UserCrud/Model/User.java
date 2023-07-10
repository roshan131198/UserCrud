package com.smartSector.UserCrud.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int userId;
private String userName;
private String userAddress;

}
