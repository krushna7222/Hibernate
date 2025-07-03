package com.org.tablePerSubClass;

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
public class Bowler1 extends TeamIndia1{
    
    private String bowlerHand;
    private int catches;

}
