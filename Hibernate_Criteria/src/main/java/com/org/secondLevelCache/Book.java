package com.org.secondLevelCache;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Cacheable                             //@Cacheable means that the entity and its state/properties must be cached/stored in the hibernate second level cache
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)    //to enabled second level cache and to store BOOK as a entity in that cache and that data is used for reading purpose only
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

     @Id
     private int id;
     private String name;
     private String aname;
     
}
