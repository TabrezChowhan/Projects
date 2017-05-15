package com.niit.shoppingcartbackend.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shoppingcartbackend.dao.SupplierDAO;
import com.niit.shoppingcartbackend.domain.Supplier;

@Repository("supplierDAO")
@Transactional
public class SupplierDAOImpl implements SupplierDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	//write user defined constructor with one parameter. i.e sessionFactory
	public SupplierDAOImpl(SessionFactory sessionFactory){
		
		this.sessionFactory=sessionFactory;
	}
@Override
	public boolean save(Supplier supplier) {
		try{
			sessionFactory.getCurrentSession().save(supplier);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
@Override
	public boolean update(Supplier supplier) {
		try{
			sessionFactory.getCurrentSession().update(supplier);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;	}
@Override
	public boolean delete(Supplier supplier) {
		// TODO Auto-generated method stub
		return false;
	}
@Override
	public List<Supplier> list() {
		// TODO Auto-generated method stub
		return null;
	}
@Override
	public Supplier get(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
