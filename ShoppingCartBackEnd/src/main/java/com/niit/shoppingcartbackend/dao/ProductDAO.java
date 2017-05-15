package com.niit.shoppingcartbackend.dao;

import java.util.List;

import com.niit.shoppingcartbackend.domain.Product;


public interface ProductDAO {
	
public boolean save(Product product);
	
	public boolean update(Product product);
	
	public boolean delete(Product product);
	
	public List<Product> list(); 
	
	public Product get(String id);

}
