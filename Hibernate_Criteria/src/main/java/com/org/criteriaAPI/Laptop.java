package com.org.criteriaAPI;


import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Laptop {
	
	@Id
	private int id;
	private String name;
	private double price;
	

}
