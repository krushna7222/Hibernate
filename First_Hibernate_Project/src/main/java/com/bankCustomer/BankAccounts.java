package com.bankCustomer;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankAccounts {
	
	@Id
	private int accountNo;
	private String bankName;
	
	@ManyToOne
	private Customer cust;
}
