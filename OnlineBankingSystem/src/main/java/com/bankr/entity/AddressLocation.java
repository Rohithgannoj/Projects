package com.bankr.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor

public class AddressLocation {
	private String hno;
	private String street;
	private String city;
	private String state;
	private Long pincode;
}
