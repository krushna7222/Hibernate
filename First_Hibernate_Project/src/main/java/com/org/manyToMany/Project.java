package com.org.manyToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {

	@Id
	private int pid;
	private String pname;
	
    @ManyToMany(mappedBy = "projects")    //this emps property mapped with "projects" property of Project table
//	@ManyToMany
	private List<Employee> emps;
	
}
