package com.car.rental.model.dao;

import java.util.List;

public interface GenericDaoI<T> {
//CRUD
	
	// CREATE
	int insertData(T data);
	
	//READ
	 List<T> getAll();
	 
	 T getDataById(long id);
	 
	 //UPDATE
	 int updateData(T data);
	 
	 //DELETE
	 int deleteData(long id);
	
	
}
