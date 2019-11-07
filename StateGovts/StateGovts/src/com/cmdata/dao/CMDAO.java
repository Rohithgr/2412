package com.cmdata.dao;

import java.util.List;

import com.cmdata.model.CM;

public interface CMDAO {
	
	List<CM> get();
	
	boolean save(CM employee);
	
	boolean delete(String state);
	
	
}