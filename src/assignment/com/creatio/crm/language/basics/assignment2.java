package assignment.com.creatio.crm.language.basics;

public class assignment2 {
	
	public class Assignment2 {
		public static void main(String[] args) {
	        // Define a 2D array to store product details
	        String[][] products = {
	            // Groceries - Beverages
	            {"Groceries", "Beverages", "1", "Cola"},
	            {"Groceries", "Beverages", "2", "Orange Juice"},
	            {"Groceries", "Beverages", "3", "Lemonade"},
	            {"Groceries", "Beverages", "4", "Green Tea"},
	            {"Groceries", "Beverages", "5", "Black Coffee"},
	            
	            // Groceries - Snacks
	            {"Groceries", "Snacks", "1", "Popcorn"},
	            {"Groceries", "Snacks", "2", "Trail Mix"},
	            {"Groceries", "Snacks", "3", "Beef Jerky"},
	            {"Groceries", "Snacks", "4", "Salted Nuts"},
	            {"Groceries", "Snacks", "5", "Rice Cakes"},
	            
	            // Groceries - Dairy Products
	            {"Groceries", "Dairy Products", "1", "Cottage Cheese"},
	            {"Groceries", "Dairy Products", "2", "Heavy Cream"},
	            {"Groceries", "Dairy Products", "3", "Ice Cream"},
	            {"Groceries", "Dairy Products", "4", "Parmesan Cheese"},
	            {"Groceries", "Dairy Products", "5", "Eggnog"},
	            
	            // Groceries - Produce
	            {"Groceries", "Produce", "1", "Apples"},
	            {"Groceries", "Produce", "2", "Bananas"},
	            {"Groceries", "Produce", "3", "Carrots"},
	            {"Groceries", "Produce", "4", "Potatoes"},
	            {"Groceries", "Produce", "5", "Onions"},
	            
	            // Electronics - Computers
	            {"Electronics", "Computers", "1", "Laptop"},
	            {"Electronics", "Computers", "2", "Desktop"},
	            {"Electronics", "Computers", "3", "Tablet"},
	            {"Electronics", "Computers", "4", "Gaming PC"},
	            {"Electronics", "Computers", "5", "Monitor"},
	            
	            // Electronics - Mobile Devices
	            {"Electronics", "Mobile Devices", "1", "Smartphone"},
	            {"Electronics", "Mobile Devices", "2", "Smartwatch"},
	            {"Electronics", "Mobile Devices", "3", "Tablet"},
	            {"Electronics", "Mobile Devices", "4", "E-Reader"},
	            {"Electronics", "Mobile Devices", "5", "Power Bank"},
	            
	            // Electronics - Home Appliances
	            {"Electronics", "Home Appliances", "1", "Vacuum Cleaner"},
	            {"Electronics", "Home Appliances", "2", "Microwave"},
	            {"Electronics", "Home Appliances", "3", "Washing Machine"},
	            {"Electronics", "Home Appliances", "4", "Refrigerator"},
	            {"Electronics", "Home Appliances", "5", "Air Conditioner"},
	            
	            // Electronics - Audio Devices
	            {"Electronics", "Audio Devices", "1", "Headphones"},
	            {"Electronics", "Audio Devices", "2", "Bluetooth Speaker"},
	            {"Electronics", "Audio Devices", "3", "Soundbar"},
	            {"Electronics", "Audio Devices", "4", "Home Theater"},
	            {"Electronics", "Audio Devices", "5", "Turntable"}
	        };

	        // Print all products neatly
	        System.out.println("Supermarket Product Catalog:");
	        System.out.printf("%-15s %-20s %-10s %-20s%n", "Main Category", "Subcategory", "Product ID", "Product Name");
	        System.out.println("--------------------------------------------------------------------------------");

	        // Traditional for loop for iterating through products
	        for (int i = 0; i < products.length; i++) {
	            System.out.printf("%-15s %-20s %-10s %-20s%n", 
	                products[i][0], // Main Category
	                products[i][1], // Subcategory
	                products[i][2], // Product ID
	                products[i][3]  // Product Name
	            );
	        }
	    }
	}




}
