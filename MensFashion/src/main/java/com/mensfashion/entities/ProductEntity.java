package com.mensfashion.entities;

import java.util.HashSet;
import java.util.Set;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Products")
@NoArgsConstructor
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	private float price;
	private int discount;
	private float discountPrice;
	
	@ManyToOne
	@JoinColumn(name="Category_id")
	private CategoryEntity category;

	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	private Set<ColorsEntity> colors = new HashSet<>();

	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	private Set<SizeEntity> sizes = new HashSet<>();
	
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	private Set<DescriptionAndFitEntity> descnFit = new HashSet<>();
	
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	private Set<MaterialEntity>material = new HashSet<>();
	
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	private Set<CareGuide> care = new HashSet<>();
}
