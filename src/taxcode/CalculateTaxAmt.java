package taxcode;

import java.util.Scanner;

public class CalculateTaxAmt {

    public static void main( String[] args )
   {
   		Scanner keyboard = new Scanner(System.in); 
    	String cusID;
    	String cusName;
    	double salesAmount;
    	String taxCode;
    	double totAmount;
    	double toPercent;
    	
    	while (keyboard.hasNext()) {
    		   // if the next is a double, print found and the double
  		
        if (keyboard.hasNext()) {
    	System.out.print("Enter Customer ID: ");
    	cusID = keyboard.next();
    	
       	System.out.print("Enter Customer Name: ");
       	cusName = keyboard.next();  
       	
       	System.out.print("Enter Sales Amount: ");
       	salesAmount = keyboard.nextDouble(); 
       	
       	System.out.print("Enter Tax Code: ");
       	taxCode = keyboard.next(); 
       	
        if (taxCode.equalsIgnoreCase("NRM"))
            toPercent = 0.06;                                                                                                                                                                                                                                                                       
        else if (taxCode.equalsIgnoreCase("NPF"))
        	toPercent = 0.0;
        else if (taxCode.equalsIgnoreCase("BIZ"))
           	toPercent = 0.045;
        else
          	toPercent = 0.100;    	
    
        totAmount = salesAmount + (salesAmount * toPercent);

        System.out.println(cusID);     		
        System.out.println(cusName);      		
        System.out.println(salesAmount);     	
       	System.out.println(taxCode);
     	System.out.println(totAmount);
    	  }
    	}	
    }
}