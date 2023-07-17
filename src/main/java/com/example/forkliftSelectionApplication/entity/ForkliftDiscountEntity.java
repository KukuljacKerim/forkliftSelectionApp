package com.example.forkliftSelectionApplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "fl_forklift_discounts")
public class ForkliftDiscountEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "forklift_id", referencedColumnName = "id")
	private ForkliftEntity forkliftEntity;

	@ManyToOne
	@JoinColumn(name = "discount_id", referencedColumnName = "id")
	private DiscountEntity discountEntity;

	// Constructors, getters, and setters
}
