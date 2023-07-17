package com.example.forkliftSelectionApplication.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fl_forklifts")
public class ForkliftEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "model")
	private String model;

	@Column(name = "lifting_capacity")
	private double liftingCapacity;

	@Column(name = "lifting_height")
	private double liftingHeight;

	@Column(name = "fuel_type")
	private String fuelType;

	@Column(name = "manufacture_year")
	private int manufactureYear;

	@Column(name = "price")
	private BigDecimal price;

	// Constructors, getters, and setters
}
