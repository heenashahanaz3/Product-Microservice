package com.ProductDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProductDetails.model.ProductDetailsModel;
public interface ProductDetailsRepository extends JpaRepository<ProductDetailsModel,Long>{

}
