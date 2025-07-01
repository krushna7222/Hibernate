package com.org;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("Bike")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bike extends Vehicle{
	
	private boolean hasgear;

}
