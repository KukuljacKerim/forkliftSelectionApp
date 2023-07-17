package com.example.forkliftSelectionApplication.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "fl_forklift_details")
public class ForkliftDetailsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	@JoinColumn(name = "forklift_id", referencedColumnName = "id")
	private ForkliftEntity forkliftEntity;

	@Column(name = "description")
	private String description;

	@Column(name = "images")
	private List<String> images;

	// Constructors, getters, and setters
}
