package com.dao;

import com.model.Restaurant;

public interface RestaurantInterface {
	
	boolean addrestaurant(Restaurant r);
	boolean deleterestaurant(int res_id);
	boolean searchrestaurant(int id);
	boolean updaterestaurant(String column, String str, int rest_id);
	boolean updaterestaurant2(String column, int no, int rest_id);
	boolean checkActivateDeactivate(int id);
}
