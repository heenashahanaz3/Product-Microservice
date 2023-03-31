package com.ProductDetails.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProductDetails.exception.ProductNotFoundException;
import com.ProductDetails.model.ProductDetailsModel;
import com.ProductDetails.service.ProductDetailsService;



@RestController
@RequestMapping("/productitems")
@CrossOrigin("http://localhost:3000")
public class ProductDetailsController {
	
	private ProductDetailsService menuItemService;
	
	public ProductDetailsController(ProductDetailsService menuItemService) {
		super();
		this.menuItemService = menuItemService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> saveMenu(@RequestBody ProductDetailsModel menuitem){
		return new ResponseEntity<String>(menuItemService.saveMenu(menuitem),HttpStatus.CREATED);
	}

	@GetMapping("/get")
	public List<ProductDetailsModel> getMenuItemListCustomer() {
		return menuItemService.getMenuItemListCustomer();
	}
	
	
	@GetMapping("/get/{id}")
	public ResponseEntity<ProductDetailsModel> getMenuItem(@PathVariable("id") Long id) throws ProductNotFoundException{
		
		return new ResponseEntity<ProductDetailsModel> (menuItemService.getMenuItem(id), HttpStatus.OK);
	}

	
	@PutMapping("/update/{id}")
	public ResponseEntity<ProductDetailsModel> modifyMenuItem(@PathVariable("id") Long id,@RequestBody ProductDetailsModel menuitem) throws ProductNotFoundException{
		return new ResponseEntity<ProductDetailsModel> (menuItemService.modifyMenuItem(menuitem, id),HttpStatus.OK);
	}
	
}