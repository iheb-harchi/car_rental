package com.car.rental.model.dao.impl;

import java.util.List;

import com.car.rental.domain.UserData;
import com.car.rental.model.dao.GenericDaoI;

public class UserDao implements GenericDaoI<UserData> {

	public UserDao() {
		
	}

	@Override
	public int insertData(UserData data) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<UserData> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserData getDataById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateData(UserData data) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteData(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
