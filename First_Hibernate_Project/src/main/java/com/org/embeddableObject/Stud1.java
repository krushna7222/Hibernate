package com.org.embeddableObject;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stud1 {

	@Id                     //primary key           
	private int id;    //comname
	private String name;//color
	private String city;  //Address
	private Certificate certi;  //certijava,3 month

	
}
