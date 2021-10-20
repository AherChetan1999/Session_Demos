package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.Restaurant;
import configuration.DBConnector;



public class AddRestaurant implements RestaurantInterface 
{
	
	public boolean addrestaurant(Restaurant r) {

		try(Connection con = DBConnector.connect(); 
				PreparedStatement preparestatement = con.prepareStatement("insert into rest_table(rest_id, rest_name, Address ,Opening_time,Closing_time, phon_no,cuisine, checkstatus) values(?,?,?,?,?,?,?,?);"))
				    
							                                            // insert into rest_table(rest_id, rest_name, Address ,Opening_time,Closing_time, phon_no, cuisine, checkstatus)values(?,?,?,?,?,?,?,?)

				{
			
				preparestatement.setInt(1, r.getRes_id());
				preparestatement.setString(2, r.getName());
				preparestatement.setString(3, r.getAddress());
				preparestatement.setString(4,r.getOpening_time());
				preparestatement.setString(5, r.getClosing_time());
				preparestatement.setInt(6, r.getPhone_no());
				preparestatement.setString(7, r.getCuisine());
				preparestatement.setInt(8,r.isActive());
				
					
				int i = preparestatement.executeUpdate();
				if(i>0) {
					System.out.println("added successfully..........");
					return true;
				}
				
				}catch(Exception e) 
				{
					
				}
		return false;
	}
		
		

	@Override
	public boolean deleterestaurant(int res_id) {
		// TODO Auto-generated method stub
		
		try(Connection conn = DBConnector.connect(); 
				PreparedStatement preparestatement = conn.prepareStatement("delete from rest_table WHERE rest_id=?;"))
		{
			preparestatement.setInt(1, res_id);
			int i = preparestatement.executeUpdate();
			if(i>0)
			{
				System.out.println("restaurant deleted....");
                                return true;
			}
		}catch (Exception e) {
			System.out.println(e);
		}
				
		return false;
	}

	@Override
	public boolean searchrestaurant(int search_id) {
		
		
		try(Connection con = DBConnector.connect();
				PreparedStatement preparestatement = con.prepareStatement("select * from  rest_table where rest_id= ?");)
		{
		
			preparestatement.setInt(1,search_id);
			
		//	System.out.println(preparestatement);
			
			ResultSet rs=preparestatement.executeQuery();
			while(rs.next()) {
				// rest_id, rest_name, Address ,Opening_time,Closing_time, phon_no,cuisine, checkstatus
				int getid = rs.getInt("rest_id");
				String getname= rs.getString("rest_name"); 
				String getAddress= rs.getString("Address");
				String getOpening_time= rs.getString("Opening_time");
				String getClosing_time= rs.getString("Closing_time");
				int getphon_no = rs.getInt("phon_no");
				String getcuisine= rs.getString("cuisine");
				String getcheckstatus= rs.getString("checkstatus");
				
				
				
				System.out.println("\nid : "+ getid +" \nrestaurant_name: "+getname+" \nAddress : "+getAddress+" \nOpening_time : "+getOpening_time+" \nClosing_time : "+getClosing_time+" \nphone_no: "+getphon_no+" \ncuisine: "+getcuisine+" \nActive/Deactivate: "+getcheckstatus+"\n");
			     return true;
			}
			
		}
		catch(Exception e) {
			System.out.println();
		}
		
		
		
		return false;
	}

	@Override
	public boolean updaterestaurant( String column,  String str , int rest_id) {
		// TODO Auto-generated method stub
		try(Connection con = DBConnector.connect();
				PreparedStatement preparestatement = con.prepareStatement("update rest_table set " + column +" = ? where rest_id= ?");)
		{
	
				preparestatement.setString(1,str);
				preparestatement.setInt(2, rest_id);
				int i = preparestatement.executeUpdate();
				if(i>0)
				{
					System.out.println("Update successfully.......");
					
					return true;
				}
				
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}

	
	
	
	
	public boolean updaterestaurant2( String column,  int phone_no , int rest_id) {
		// TODO Auto-generated method stub
		try(Connection con = DBConnector.connect();
				PreparedStatement preparestatement = con.prepareStatement("update rest_table set " + column +" = ? where rest_id= ?");)
		{
		

				preparestatement.setInt(1, phone_no);
				preparestatement.setInt(2, rest_id);
				
			
				int i = preparestatement.executeUpdate();
				if(i>0)
				{
					System.out.println("Update successfully.......");
			
					return true;
				}
		
		}		catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}

	
	
	
	@Override
	public boolean checkActivateDeactivate(int id) {
		
		
		try(Connection con = DBConnector.connect();
				PreparedStatement preparestatement = con.prepareStatement("select * from  rest_table where rest_id= ?");)
		{
		
			preparestatement.setInt(1,id);
			
		//	System.out.println(preparestatement);
			
			ResultSet rs=preparestatement.executeQuery();
			while(rs.next()) {
				// rest_id, rest_name, Address ,Opening_time,Closing_time, phon_no,cuisine, checkstatus
				int getid = rs.getInt("rest_id");
				String getname= rs.getString("rest_name"); 
				String getAddress= rs.getString("Address");
				String getOpening_time= rs.getString("Opening_time");
				String getClosing_time= rs.getString("Closing_time");
				int getphon_no = rs.getInt("phon_no");
				String getcuisine= rs.getString("cuisine");
				int getcheckstatus= rs.getInt("checkstatus");
				String check;
				
				if(getcheckstatus == 1)
				{
					check ="Restaurant is Active";
				}
				else
				{
					check ="Restaurant is Deactive";
				}
				
				System.out.println("\nid : "+ getid +" \nrestaurant_name: "+getname+" \nAddress : "+getAddress+" \nOpening_time : "+getOpening_time+" \nClosing_time : "+getClosing_time+" \nphone_no: "+getphon_no+" \ncuisine: "+getcuisine+" \nActive/Deactivate: "+check+"\n");
			     return true;
			}
			
		}
		catch(Exception e) {
			System.out.println();
		}
		
		
		return false;
	}



	
	

}
