package com.mensfashion.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Material")
@Getter
@Setter
@NoArgsConstructor
public class MaterialEntity {
	
	@ManyToOne
	private ProductEntity product;
	private String material;
	private int composition;
}
