package com.org.embeddableObject;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable // @Embeddable annotation tells the compiler that do not create a new table for
			// this current class..instead, embedd the fields of the current class(i.e
			// Certificate into another class)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Certificate {

	private String course;
	private String duration;

}
