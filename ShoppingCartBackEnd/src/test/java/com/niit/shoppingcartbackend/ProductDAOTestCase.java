package com.niit.shoppingcartbackend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcartbackend.dao.ProductDAO;
import com.niit.shoppingcartbackend.domain.Product;

public class ProductDAOTestCase {

@Autowired static AnnotationConfigApplicationContext context;
	
	// if you are using xml based configuration
	
	
	@Autowired static ProductDAO productDAO;

	@Autowired static Product product;
	
	//the above object need to initialize
	//this method is going to execute before calling any one of test case
	//and will execute once
	@BeforeClass
	public static void initialize(){
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		//get the userDAO from context
		productDAO=(ProductDAO) context.getBean("productDAO");
		
		//get the user from context
		product=(Product) context.getBean("product");

	}
	//@Test
		public void createProductTestCase(){
		
			product.setId("P101");
			product.setName("Iphone");
			product.setDescription("Iphone 7 Imported");
			product.setCategory_id("C101");
			product.setPrice("50000");
			product.setSupplier_id("S101");
			
			
			boolean flag=productDAO.save(product);
			
			assertEquals("createProductTestCase",true,flag);
			
				}
}
