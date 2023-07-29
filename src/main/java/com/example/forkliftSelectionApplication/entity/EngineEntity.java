package com.example.forkliftSelectionApplication.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "fl_engine")
@Data
public class EngineEntity {
	@Id
	@Column(name = "engine_code")
	private String engineCode;

	@Column(name = "engine_name")
	private OrderEntity engineName;

	@Column(name = "engine_power")
	private ForkliftEntity enginePower;

}
