package com.example.demo.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
@Table(name="Customer")
public class Fedex {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Integer CustomerId;
	@Size(min=3 , max=10)
	@Column
	private  String CustomerName;
	@Column
	private  String CustomerEmail;
	@Column
	private  Integer CustomerContactNo;
	@Column
	private  String Country;
	@Column
	private String state;
	@Column
	private  String City;
	@Column
	private  Integer Zipcode;
	@Column
	private  Date DateAdded;
	@Column
	private  String Actions;
	
	
	


	
}
