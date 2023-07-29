package com.example.forkliftSelectionApplication.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "fl_battery")
@Data
public class BatteryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "batery_code")
	private Long bateryCode;

	@Column(name = "battery_voltage")
	private ForkliftEntity batteryVoltage;

	@Column(name = "battery_weight")
	private BatteryEntity batteryWeight;

}
