package com.mensfashion.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Careguide")
@Getter
@Setter
@NoArgsConstructor
public class CareGuide {
	
	@ManyToOne
	private ProductEntity product;
	private String desc;
}
