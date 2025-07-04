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
//@DiscriminatorValue(value = "Bowler")
public class Bowler2 extends TeamIndia2{
    
    private String bowlerHand;
    private int catches;

}
