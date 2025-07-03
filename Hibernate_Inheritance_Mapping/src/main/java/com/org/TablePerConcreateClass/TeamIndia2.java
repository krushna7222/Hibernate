package com.org.TablePerConcreateClass;

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
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorValue(value = "TeamIndia")
@Data
@NoArgsConstructor
public abstract class TeamIndia2 {

     @Id 
     @GeneratedValue(strategy = GenerationType.AUTO)
     private int id;
     private String fname;
     private String lname;
     
    public TeamIndia2(String fname, String lname) {
        super();
        this.fname = fname;
        this.lname = lname;
    }
     
     
}
