package removemethod.com;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveElements {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>(5);  
	      
	      arr.add("abc");  
	      arr.add("pqr");  
	      arr.add("xyz");  
	      arr.add("lmn");  
	      System.out.println("The list of the size is: " + arr.size());  
	   
	      for (String name : arr) {  
	    	  System.out.println("Name is: " + name); 
	      }
	    	  
	      

	      arr.remove(1);  
	      System.out.println("\nAfter removing the element the size of the ArrayList is: " + arr.size());  
	     
	      for (String name : arr) {  
	         System.out.println("Name is: " + name);  
	      }  

	}

}
