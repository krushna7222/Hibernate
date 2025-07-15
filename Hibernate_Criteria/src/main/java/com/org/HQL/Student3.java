package com.org.HQL;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student3 {
	
    @Id                     //@Id annotation is used to mark the current field/variable as a primary key  in the table      
    private int id;     
    private String name;
    private String city;
    private int marks;
    

}
