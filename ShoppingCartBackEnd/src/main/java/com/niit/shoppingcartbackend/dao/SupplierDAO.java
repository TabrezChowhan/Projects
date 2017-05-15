package com.niit.shoppingcartbackend.dao;

import java.util.List;

import com.niit.shoppingcartbackend.domain.Supplier;

public interface SupplierDAO {
	
public boolean save(Supplier supplier);
	
	public boolean update(Supplier supplier);
	
	public boolean delete(Supplier supplier);
	
	public List<Supplier> list(); 
	
	public Supplier get(String id);


}
