package com.mensfashion.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="DescriptionandFit")
@Getter
@Setter
@NoArgsConstructor
public class DescriptionAndFitEntity {
	
	@ManyToOne
	private ProductEntity product;
	private String Desc;
	
	@OneToMany(mappedBy = "descNfit",cascade = CascadeType.ALL)
	private Set<FitEntity> fitting = new HashSet<>();
}
