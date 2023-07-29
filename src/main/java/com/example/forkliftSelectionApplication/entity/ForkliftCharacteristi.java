package com.example.forkliftSelectionApplication.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "fl_forklift_characteristic")
@Data
public class ForkliftCharacteristi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "forklift_characteristi_code")
	private Long forkliftCharacteristicCode;
	@ManyToOne
	@JoinColumn(name = "forklift_code_fk", referencedColumnName = "forklift_code")
	private ForkliftEntity forkliftEntity;
	@ManyToOne
	@JoinColumn(name = "battery_code_fk", referencedColumnName = "battery_code")
	private BatteryEntity batteryEntity;
	@ManyToOne
	@JoinColumn(name = "engine_code_fk", referencedColumnName = "engine_code")
	private EngineEntity engineEntity;
	@Column(name = "wheelbase_lenght")
	private String wheelbaseLenght;
	@Column(name = "weight")
	private String weight;
	@Column(name = "maifacture_date")
	private String maifactureDate;
	@Column(name = "fuel_type")
	private String fuelType;
	@Column(name = "fuel_capacity")
	private String fuelCapacity;
	@Column(name = "loading_capacity")
	private String loadingCapacity;
	@Column(name = "loading_center")
	private String loadingCenter;
	@Column(name = "outdoor_speed")
	private String outdoorSpeed;
	@Column(name = "indoor_speed")
	private String indoorSpeed;
	@Column(name = "image_url")
	private String imageUrl;
}
