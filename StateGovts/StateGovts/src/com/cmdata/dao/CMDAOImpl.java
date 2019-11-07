package com.cmdata.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.cmdata.model.CM;
import com.cmdata.DBConn;

public class CMDAOImpl implements CMDAO {
	
	Connection connection = null;
	ResultSet resultSet = null;
	Statement statement = null;
	PreparedStatement preparedStatement = null;
	
	@Override
	public List<CM> get() {
		
		List<CM> list = null;
		CM cm = null;
		
		try {
			
			list = new ArrayList<CM>();
			String sql = "SELECT * FROM cmdata";
			connection = DBConn.openConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				cm = new CM();
				cm.setId(resultSet.getString("id"));
				cm.setName(resultSet.getString("name"));
				cm.setQualification(resultSet.getString("qualification"));
				cm.setState(resultSet.getString("state"));
				cm.setDate(resultSet.getString("enddate"));
				cm.setParty(resultSet.getString("party"));
				
				list.add(cm);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	

	@Override
	public boolean save(CM e) {
		boolean flag = false;
		try {
			String sql = "INSERT INTO cmdata(id, name, qualification, state, enddate, party)VALUES"
					+ "('"+e.getId()+"', '"+e.getName()+"', '"+e.getQualification()+"', '"+e.getState()+"', '"+e.getDate()+"', '"+e.getParty()+"')";
			connection = DBConn.openConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			flag = true;
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean delete(String state) {
		boolean flag = false;
		try {
			String sql = "DELETE FROM cmdata where state="+state;
			connection = DBConn.openConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			flag = true;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	

}