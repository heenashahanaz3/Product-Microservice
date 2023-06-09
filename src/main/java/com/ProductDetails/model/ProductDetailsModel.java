package com.ProductDetails.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productdetails")
public class ProductDetailsModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private float price;
	
	
	@Column(name="dateoflaunch")
	private String dateoflaunch;
	
	@Column(name="category")
	private String category;
	
	@Column(name="categoryimageurl")
	private String categoryimageurl;
	
	@Column(name="freedelivery")
	private boolean freedelivery;

	@Column(name="description")
	private String description;
	
	@Column(name="imageurl")
	private String imageurl;
	
	public ProductDetailsModel(){
		
	}

	public ProductDetailsModel(long id, String name, float price, String dateoflaunch, String category,
			String categoryimageurl, boolean freedelivery, String description, String imageurl) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.dateoflaunch = dateoflaunch;
		this.category = category;
		this.categoryimageurl = categoryimageurl;
		this.freedelivery = freedelivery;
		this.description = description;
		this.imageurl = imageurl;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDateoflaunch() {
		return dateoflaunch;
	}

	public void setDateoflaunch(String dateoflaunch) {
		this.dateoflaunch = dateoflaunch;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategoryimageurl() {
		return categoryimageurl;
	}

	public void setCategoryimageurl(String categoryimageurl) {
		this.categoryimageurl = categoryimageurl;
	}

	public boolean isFreedelivery() {
		return freedelivery;
	}

	public void setFreedelivery(boolean freedelivery) {
		this.freedelivery = freedelivery;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	@Override
	public String toString() {
		return "ProductDetailsModel [id=" + id + ", name=" + name + ", price=" + price + ", dateoflaunch="
				+ dateoflaunch + ", category=" + category + ", categoryimageurl=" + categoryimageurl + ", freedelivery="
				+ freedelivery + ", description=" + description + ", imageurl=" + imageurl + "]";
	}

	
	
}