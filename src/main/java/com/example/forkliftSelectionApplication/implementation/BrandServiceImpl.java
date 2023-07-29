package com.example.forkliftSelectionApplication.implementation;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.forkliftSelectionApplication.dao.BrandDAO;
import com.example.forkliftSelectionApplication.entity.BrandEntity;
import com.example.forkliftSelectionApplication.model.BrandResponse;
import com.example.forkliftSelectionApplication.service.BrandService;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@Service
@RequiredArgsConstructor
public class BrandServiceImpl implements BrandService {
	@Autowired
	private BrandDAO brandDAO;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<BrandEntity> findAll() {
		System.out.println("Find All " + brandDAO.findAll());
		return brandDAO.findAll();
	}

	@Override
	public Optional<BrandResponse> findById(Long id) {
		// TODO Auto-generated method stub
		Optional<BrandEntity> brandEntity = brandDAO.findById(id);
		BrandResponse brandResponse = modelMapper.map(brandEntity.get(), BrandResponse.class);
		return Optional.ofNullable(brandResponse);
	}
}
