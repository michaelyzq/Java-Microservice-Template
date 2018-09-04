package com.sdcj.testTemplate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Entity
@Table(name = "USER")
@Data
public class User {
	@Id
    private Long id;

    private String name;



   
	

}
