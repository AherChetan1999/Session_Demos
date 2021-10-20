package Controller;
import java.util.Scanner;

import com.dao.AddRestaurant;
import com.dao.RestaurantInterface;
import com.model.Restaurant;

public class Main_Class {
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		boolean flag=true;
		int choice=0;
		
		
		do {
			 System.out.println("1. Search Restaurant");
			 System.out.println("2. Add Restaurant");
			 System.out.println("3. Update Restaurant");
			 System.out.println("4. Delete Restaurant");
			 System.out.println("5. Active/Deactive Restaurant");
			 
			 System.out.println("enter your choice: ");
			 choice=scanner.nextInt();
			 switch(choice){
			 
			 	case 1:
			 			System.out.println("enter the  id");
			 			int search_id = scanner.nextInt();
			 			
			 			
			 			RestaurantInterface searchobj = new AddRestaurant();
			 			searchobj.searchrestaurant(search_id);

			 			
			 			
			 			break;
			 	case 2:
			 			System.out.println("enter the id");
			 			int res_id = scanner.nextInt();
			 			
			 			System.out.println("enter the Restaurant name");
			 			String rest_name1 = scanner.nextLine();
			 			
			 			
			 			System.out.println("enter the Address");
			 			String address = scanner.nextLine();
			 			
			 		
			 			System.out.print("enter the open time");
			 			String opening_time = scanner.nextLine();
			 			
			 			System.out.println("enter the close time");
			 			String closing_time = scanner.nextLine();
			 			
			 			System.out.println("enter the phone number");
			 			int phone_no = scanner.nextInt();
			 			
			 			System.out.println("enter the cuisine");
			 			String cuisine = scanner.nextLine();
			 			
			 			System.out.println("enter the status(for active = 1 /deactive = 0)");
			 			int checkstatus = scanner.nextInt();
			 			
			 			
			 			Restaurant restaurant = new Restaurant(res_id, rest_name1, address, opening_time, closing_time, phone_no, cuisine, checkstatus);
			 		//	AddRestaurant add = new AddRestaurant(restaurant);
			 			RestaurantInterface obj = new AddRestaurant();
			 			obj.addrestaurant(restaurant);
			 			
			 			break;
			 			
			 	case 3:

		 			System.out.println("enter the id");
		 			int rest_id3 = scanner.nextInt();
		 			boolean flag2=true;

		 			
		 			int choice2;
		 			System.out.println("select what you want to change:");
		 			do {
		 				
            // insert into rest_table(rest_id, rest_name, Address ,Opening_time,Closing_time, phon_no, cuisine, checkstatus)values(?,?,?,?,?,?,?,?)

		 				 System.out.println("1. rest_name");
		 				 System.out.println("2. address");
		 				 System.out.println("3. Opening_time");
		 				 System.out.println("4. Closing_time");
		 				 System.out.println("5. phon_no");
		 				 System.out.println("6. cuisine");
		 				 System.out.println("7. checkstatus");
		 				 
		 				 
		 				 System.out.println("enter your choice: ");
		 				 choice2=scanner.nextInt();
		 				 switch(choice2){
		 				 
		 				 case 1:
		 					System.out.println("enter new Restaurant name");
				 			String rest_name3 = scanner.next();
				 			
				 			RestaurantInterface obj2 = new AddRestaurant();
				 			obj2.updaterestaurant("rest_name", rest_name3 , rest_id3);
				 			
				 			
				 			break;
					 
		 					   
		 				 case 2:
		 					System.out.println("enter new the Address");
				 			String address3 = scanner.next();
				 			
				 			RestaurantInterface obj3 = new AddRestaurant();
				 			obj3.updaterestaurant("address", address3 , rest_id3);
				 			
				 			
				 			break;

		 				 case 3:
		 					System.out.println("enter the  new open time");
				 			String opening_time3 = scanner.next();
				 			
				 			RestaurantInterface obj4 = new AddRestaurant();
				 			obj4.updaterestaurant("Opening_time", opening_time3 , rest_id3);

				 			break;
		 				 case 4:
		 					System.out.println("enter the new close time");
				 			String closing_time4 = scanner.next();
				 			
				 			RestaurantInterface obj5 = new AddRestaurant();
				 			obj5.updaterestaurant("Closing_time", closing_time4 ,  rest_id3);

				 			break;

		 				 case 5:
		 					System.out.println("enter the new phone number");
				 			int phone_no3 = scanner.nextInt();
				 			
				 			RestaurantInterface obj6 = new AddRestaurant();
				 			obj6.updaterestaurant2("phon_no", phone_no3 ,  rest_id3);

				 			break;

		 				 case 6:
		 					System.out.println("enter the new cuisine");
				 			String cuisine3 = scanner.next();
				 			
				 			RestaurantInterface obj7 = new AddRestaurant();
				 			obj7.updaterestaurant("cuisine", cuisine3 ,  rest_id3);

				 			break;

		 				 case 7:
		 					System.out.println("enter the new status(for active = 1 /deactive = 0)");
				 			int checkstatus3 = scanner.nextInt();
				 			
				 			
				 			RestaurantInterface obj8 = new AddRestaurant();
				 			obj8.updaterestaurant2("CheckStatus", checkstatus3 , rest_id3);


				 			break;
		 				 
		 				 }

		 				flag2=false;
		 				
		 			}while(flag2);
		 			
		 			
		 			break;
		 			
			 		
			 	case 4:
			 		

		 			System.out.println("enter the id");
		 			int res_id4 = scanner.nextInt();
		 			
	
		 			RestaurantInterface obj2 = new AddRestaurant();
		 			obj2.deleterestaurant(res_id4);
		 			
		 			
		 			
		 			break;

		 			
		 			
			 	case 5:
			 		System.out.println("enter the id");
		 			int res_id5 = scanner.nextInt();
		 			
		 			RestaurantInterface searchobj2 = new AddRestaurant();
		 			searchobj2.checkActivateDeactivate(res_id5);
		 			
		 			
		 			
			 	default:
			 		
			 		System.out.println(" Please enter the correct Choice ::");

				 
				 
			 }
		
		   }while(flag);
	}

}
