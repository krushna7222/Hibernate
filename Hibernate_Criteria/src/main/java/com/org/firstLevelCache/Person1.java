package com.org.firstLevelCache;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person1 {
	

    @Id                     //@Id annotation is used to mark the current field/variable as a primary key  in the table      
    private int id;    //insert  tina 101 pune
    
    private String name;
    private String city;

}
