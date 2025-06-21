package com.org.OneToMany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Answer1 {

	@Id
	@Column(name = "answer_id")
	private int answerId;
	private String answer1;

	@ManyToOne
	private Question1 qustion1;

}
