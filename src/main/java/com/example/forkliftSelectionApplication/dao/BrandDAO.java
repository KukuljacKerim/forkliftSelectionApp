package com.example.forkliftSelectionApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository; // Import JpaRepository
import org.springframework.stereotype.Repository;

import com.example.forkliftSelectionApplication.entity.BrandEntity;

@Repository
public interface BrandDAO extends JpaRepository<BrandEntity, Long> {

}
