package com.example.forkliftSelectionApplication.service;

import java.util.List;
import java.util.Optional;

import com.example.forkliftSelectionApplication.entity.BrandEntity;
import com.example.forkliftSelectionApplication.model.BrandResponse;

public interface BrandService {
	List<BrandEntity> findAll();

	Optional<BrandResponse> findById(Long id);
}
