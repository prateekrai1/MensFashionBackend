package com.mensfashion.dto;

import java.util.HashSet;
import java.util.Set;

import com.mensfashion.entities.CareGuide;
import com.mensfashion.entities.ColorsEntity;
import com.mensfashion.entities.DescriptionAndFitEntity;
import com.mensfashion.entities.MaterialEntity;
import com.mensfashion.entities.SizeEntity;


public class ProductDTO {
	private int productid;
	private String title;
	private float price;
	private int discount;
	private float discountPrice;
	
	private CategoryDTO category;
	
	private Set<ColorsEntity> colors = new HashSet<>();

	private Set<SizeEntity> sizes = new HashSet<>();
	
	private Set<DescriptionAndFitEntity> descnFit = new HashSet<>();
	
	private Set<MaterialEntity>material = new HashSet<>();
	
	private Set<CareGuide> care = new HashSet<>();
}
