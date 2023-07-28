package com.example.forkliftSelectionApplication.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class BrandResponse implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String brandName;
}