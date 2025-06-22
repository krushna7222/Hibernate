package com.org.manyToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "emp")
public class Employee {
	
	@Id
	private int eid;
	private String ename;
	
	
	@ManyToMany
	
	@JoinTable(name="emp_proj_data",   //here,the third table "emp_proj_data" will be created in db with 2 columns emps_id,projects_pid. In this 1st column is join column and second is inverse join column, and that called as "join table" which consists of columns of more than one entity on which we have applied @ManyToMany annotation
		joinColumns =               //here,we are changing the name of join column, using @JoinColumn
		{
				@JoinColumn(name="eid")
		}, 
		inverseJoinColumns =       //here,we are changing the name of inverse join column, using @JoinColumn 
		{
				@JoinColumn(name="pid")
		})
 
	private List<Project> projects;

}
