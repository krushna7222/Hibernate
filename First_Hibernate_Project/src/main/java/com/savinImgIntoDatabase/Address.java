package com.savinImgIntoDatabase;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;


import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
//@Entity(name = "StudAddress")
@Entity
@Table(name = "StudAddressNew")
public class Address {  //StudAddress

      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      private int id;
      
      @Column(length = 40)
      private String city;
      
      @Column(name="streetInCity", length = 50)
      private String street;
      
      
      private boolean isOpen;
      
      private long pincode;
      
      @Transient
      private double km;
      
      @Temporal(TemporalType.TIMESTAMP)
      private Date a_date;
      
      @Lob
      private byte[]  img;   //bytes 0111101010
      
}
