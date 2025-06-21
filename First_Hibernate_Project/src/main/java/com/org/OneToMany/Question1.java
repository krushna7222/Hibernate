package com.org.OneToMany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question1 {
	
	@Id
    @Column(name="question_id")
    private int questionId;
    private String question1;

    
   @OneToMany(mappedBy = "qustion1",cascade = CascadeType.ALL)     // //,fetch = FetchType.EAGER)    //if we are not using the "mappedBy" attri then in that  case it will create one more table "question1_answers" //this "qustion1" is variable of Answer1 table not Question1 table
//    @OneToMany(mappedBy = "qustion1")                   //(fetch = FetchType.EAGER)
    //@OneToMany
    private List<Answer1> answers; //1,1,1, 21,22,23//BankAcca1,a2,a3.....


}
