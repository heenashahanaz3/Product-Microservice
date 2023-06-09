package com.ProductDetails.service;

import java.util.List;



import org.springframework.stereotype.Service;

import com.ProductDetails.exception.ProductNotFoundException;
import com.ProductDetails.model.ProductDetailsModel;
import com.ProductDetails.repository.ProductDetailsRepository;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService {


	private ProductDetailsRepository menuRepository;

	public ProductDetailsServiceImpl(ProductDetailsRepository menuRepository) {
		super();
		this.menuRepository = menuRepository;
	}

	@Override
	public String saveMenu(ProductDetailsModel menuitem) {
		menuRepository.save(menuitem);
		return menuitem.getName() + " Item Added Successfully!";
	}
	
	@Override
	public List<ProductDetailsModel> getMenuItemListCustomer() {
		return menuRepository.findAll();
	}

	@Override
	public ProductDetailsModel modifyMenuItem(ProductDetailsModel menuItem,Long id) throws ProductNotFoundException {
		ProductDetailsModel existingItem = menuRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(null));
		existingItem.setName(menuItem.getName());
		existingItem.setCategory(menuItem.getCategory());
		existingItem.setDateoflaunch(menuItem.getDateoflaunch());
		existingItem.setFreedelivery(menuItem.isFreedelivery());
		existingItem.setPrice(menuItem.getPrice());
		existingItem.setDescription(menuItem.getDescription());
		existingItem.setImageurl(menuItem.getImageurl());
		existingItem.setCategoryimageurl(menuItem.getCategoryimageurl());
		menuRepository.save(existingItem);
		return existingItem;
	}

	@Override
	public ProductDetailsModel getMenuItem(long id) throws ProductNotFoundException {
		return menuRepository.findById(id).orElseThrow(()-> new ProductNotFoundException(null));
	}

}