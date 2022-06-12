package com.bankr.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SavingsAccounts")
public class SavingsAccount {

	@Id
	@SequenceGenerator(initialValue = 120000000, name = "SavingsAccountSeries")
	@Column(nullable = false, length = 10, unique = true)
	private Long accountNumber;
	
	@Column(nullable = false, length = 10)
	private String accountHolderName;
	
	@Column(nullable = false)
	private Date dateOfBirth;
	
	@Column(nullable = false)
	private String fatherName;
	
	@OneToOne
	@MapsId
	private AddressLocation addressLocation;
	
	@Column(nullable = false)
	private Long phoneNumber;

}
