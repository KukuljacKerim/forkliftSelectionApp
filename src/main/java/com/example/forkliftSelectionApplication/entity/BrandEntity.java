package com.example.forkliftSelectionApplication.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "fl_brand")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BrandEntity {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	@Column(name = "brand_name")
	private String brandName;
	@Column(name = "created")
	private LocalDateTime created;

}
