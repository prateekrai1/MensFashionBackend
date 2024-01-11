package com.mensfashion.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Fit")
@Getter
@Setter
public class FitEntity {

	@ManyToOne
	private DescriptionAndFitEntity descNfit;
	
	private String length;
	private String sleeveLength;
	private String fitting;
	private String neckline;
}
