package com.org;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("Car")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car extends Vehicle{
	
	private int speed;

}
