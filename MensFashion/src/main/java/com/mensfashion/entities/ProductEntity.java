package com.mensfashion.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "products")
@NoArgsConstructor
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	private String desc;
	private float price;
	private String Color;
	private String Size;
	private int discount;
	private int quantity;
	private String image;
	private float discountPrice;
	
	@ManyToOne
	@JoinColumn(name="Category_id")
	private CategoryEntity category;
	
}
