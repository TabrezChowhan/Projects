package com.niit.shoppingcartbackend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcartbackend.dao.SupplierDAO;
import com.niit.shoppingcartbackend.domain.Supplier;

public class SupplierDAOTestCase {

@Autowired static AnnotationConfigApplicationContext context;
	
	// if you are using xml based configuration
	
	
	@Autowired static SupplierDAO supplierDAO;

	@Autowired static Supplier supplier;
	
	//the above object need to initialize
	//this method is going to execute before calling any one of test case
	//and will execute once
	@BeforeClass
	public static void initialize(){
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		//get the userDAO from context
		supplierDAO=(SupplierDAO) context.getBean("supplierDAO");
		
		//get the user from context
		supplier=(Supplier) context.getBean("supplier");

	}
	//@Test
		public void createSupplierTestCase(){
		
			supplier.setId("S101");
			supplier.setName("Amazon");
			supplier.setAddress("Delhi");
			
			
			boolean flag=supplierDAO.save(supplier);
			
			assertEquals("createSupplierTestCase",true,flag);
			
				}
		//@Test
		public void updateSupplierTestCase(){
			
			supplier.setId("S101");
			supplier.setName("Amazon");
			supplier.setAddress("Hyderabad");
			
			
			boolean flag=supplierDAO.update(supplier);
			
			assertEquals("updateSupplierTestCase",true,flag);
			
				}	


}
