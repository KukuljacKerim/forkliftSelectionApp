package com.example.forkliftSelectionApplication.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "fl_deliveries")
public class DeliveryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "order_id", referencedColumnName = "id")
	private OrderEntity orderEntity;

	@ManyToOne
	@JoinColumn(name = "supplier_id", referencedColumnName = "id")
	private SupplierEntity supplierEntity;

	@Column(name = "delivery_date")
	private LocalDate deliveryDate;

	@Column(name = "status")
	private String status;

	// Constructors, getters, and setters
}
