package com.mensfashion.dto;

import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductDTO {
	private String title;
	private String desc;
	private float price;
	private String Color;
	private String Size;
	private int discount;
	private int quantity;
	private String image;
	private float discountPrice;
	private CategoryDTO category;
	
}
