package com.mensfashion.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="Colors")
@Getter
@Setter
public class ColorsEntity {
	
	@ManyToOne
	private ProductEntity product;
	
	private String colorCode;
	private String ColorName;
	
}
