package com.org.TablePerConcreateClass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@DiscriminatorValue(value = "Batsman")
public class Batsman2 extends TeamIndia2{

     private String battingHand;
     private double avg;
}