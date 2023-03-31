package com.ProductDetails.service;

import java.util.List;

import com.ProductDetails.exception.ProductNotFoundException;
import com.ProductDetails.model.ProductDetailsModel;


public interface ProductDetailsService {
	
	String saveMenu(ProductDetailsModel menuitem);
	
	List<ProductDetailsModel> getMenuItemListCustomer();

	ProductDetailsModel modifyMenuItem(ProductDetailsModel menuItem,Long id) throws ProductNotFoundException;

	ProductDetailsModel getMenuItem(long id) throws ProductNotFoundException;
}