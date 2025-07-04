package com.org.tablePerClass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue(value = "TeamIndia")
//@DiscriminatorValue(value = "staffs")
@Data
@NoArgsConstructor
public class TeamIndia {

     @Id 
     @GeneratedValue(strategy = GenerationType.AUTO)
     private int id;
     private String fname;
     private String lname;
     
    public TeamIndia(String fname, String lname) {
        super();
        this.fname = fname;
        this.lname = lname;
    }
     
     
}
