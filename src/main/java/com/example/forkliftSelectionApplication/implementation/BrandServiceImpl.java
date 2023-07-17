package com.example.forkliftSelectionApplication.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.forkliftSelectionApplication.dao.BrandDAO;
import com.example.forkliftSelectionApplication.entity.BrandEntity;
import com.example.forkliftSelectionApplication.service.BrandService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BrandServiceImpl implements BrandService {
	@Autowired
	private BrandDAO brandDAO;
	@Override
	public List<BrandEntity> findAll() {
		return brandDAO.findAll();
	}

}
