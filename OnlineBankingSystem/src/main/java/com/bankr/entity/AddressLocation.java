package com.bankr.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class AddressLocation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(nullable = false,name ="houseNumber",length = 10)
	private String hno;
	@Column(nullable = false,length = 20)
	private String street;
	@Column(nullable = false,length = 20)
	private String city;
	@Column(nullable = false,length = 15)
	private String state;
	@Column(nullable = false,length = 6)
	private Long pincode;
}
