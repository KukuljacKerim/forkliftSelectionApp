package com.example.forkliftSelectionApplication.rest.brand;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.forkliftSelectionApplication.entity.BrandEntity;
import com.example.forkliftSelectionApplication.service.BrandService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/brand")

public class BrandRestService {
	@Autowired
	private BrandService brandService;

	@Operation(summary = "Find all")
	@GetMapping(value = "find-all")
	public List<BrandEntity> find() {
		return brandService.findAll();
	}

}
