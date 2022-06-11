package com.bankr.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class SavingsAccount {
	
	private Long accountNumber;
	private String accountHolderName;
	private Date dateOfBirth; 
    private String fatherName;
    private AddressLocation addressLocation;
    private Long phoneNumber;
//    AddressLocation(Type)=>(hno,street,city,state,pincode), 
   
}
