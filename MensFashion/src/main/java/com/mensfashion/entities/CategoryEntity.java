package com.mensfashion.entities;
import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;

@Entity
@Table(name="categories")
@Getter
@Setter
@NoArgsConstructor
public class CategoryEntity {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int category_id;
	
	private String categoryTitle;
	private String categoryDesc;
	
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	private Set<ProductEntity> product = new HashSet<>();
}
