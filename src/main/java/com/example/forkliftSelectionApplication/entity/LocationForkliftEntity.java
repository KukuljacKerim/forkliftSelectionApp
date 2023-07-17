package com.example.forkliftSelectionApplication.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "fl_location_forklifts")
public class LocationForkliftEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "forklift_id", referencedColumnName = "id")
	private ForkliftEntity forkliftEntity;

	@ManyToOne
	@JoinColumn(name = "location_id", referencedColumnName = "id")
	private LocationEntity locationEntity;

	@Column(name = "availability")
	private boolean availability;

	// Constructors, getters, and setters
}
