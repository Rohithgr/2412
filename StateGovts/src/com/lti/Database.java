package com.lti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.sun.corba.se.spi.orbutil.fsm.State;

public class Database {
	  public static Connection getConnection(){  
	        Connection con=null;  
	        try{  
	            Class.forName("oracle.jdbc.driver.OracleDriver");  
	            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:9999:xe","hr","hr");  
	        }catch(Exception e){System.out.println(e);}  
	        return con;  
	    }  
	    public static int save(state e){  
	        int status=0;  
	        try{  
	            Connection con=Database.getConnection();  
	            PreparedStatement ps=con.prepareStatement(  
	                         "insert into State(cid,cname,qualification,state,enddate,party) values (?,?,?,?,?,?)");  
	            ps.setInt(1,e.getCid());  
	            ps.setString(2,e.getCname());  
	            ps.setString(3,e.getQualification());  
	            ps.setString(4,e.getDate());  
	            ps.setInt(5,e.getEnddate());
	            ps.setString(6,e.getParty());	           
	              
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  

}
		private String getCountry() {
			// TODO Auto-generated method stub
			return null;
		}
		private String getEmail() {
			// TODO Auto-generated method stub
			return null;
		}
		private String getPassword() {
			// TODO Auto-generated method stub
			return null;
		}
		private String getCid() {
			// TODO Auto-generated method stub
			return null;
		}
}
