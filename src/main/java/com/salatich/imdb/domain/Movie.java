package com.salatich.imdb.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "MOVIES")
public class Movie {

	@Id
	@Column(name="ID")
	@GeneratedValue
	private Integer id;
	
	@Column(name = "NAME")
	private String name;
	
	public Integer getId(){
		return id;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
}
