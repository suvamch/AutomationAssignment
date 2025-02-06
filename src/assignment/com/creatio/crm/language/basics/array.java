package assignment.com.creatio.crm.language.basics;

public class array {
    public static void main(String[] args) {
        int[] a = {12, 58, 62, 75, 71, 34}; // Initialize array
        int j = 0;

        for (int i = 0; i < a.length-1; i++) { // Loop until second last element
        	
        		do {
            if (a[i] >= a[i + 1]){ // Compare current and next eleme
         
                a[j] = a[i];
                j = j + 1;
                // Print the stored value
            }
            }
        		 while(a[j]<=75);
        		 System.out.println("Element in the array: " + a[j]);
        }
       
    }
    }


