package javaProject_Assignment2;// package declaration 
import java.util.Scanner;
/*
 This program will help you master the concepts of loops and Nested Loops.
 Write a program to print the “X” pattern:
 */

	public class XPattern 
	{
		 //Main method started
		public static void main(String[] args) {
			
			//object initialized for user input
			Scanner s = new Scanner(System.in);                     
	        System.out.print("Enter the size of X Pattern : ");
	        ////Integer variable size initialized to get the input from user
	        int size = s.nextInt();                 
	        ////Two Integer variables row and column initialized
	        int rows, column;
	        ////Object of scanner class "s" closed
	        s.close();                
	        //for loop expression started, value of row initialized to 1,this condition will execute till number of rows is less than equal to size.
	        for (rows = 1; rows <= size; rows++) { 
	        	//nested for loop expression started, value of column initialized to 1,this condition will execute till number of column is less than equal to size.
	        	for (column = 1; column <= size; column++) {	
	        		//// if condition to check values of column and rows are same 
	                 if (column == rows) {    
	                	 //it will print "*" when condition will be true
	                     System.out.print("*");                                    
	                  }                                   
	               //else if condition to check the diagonal coordinates starting from last column
	                  else if (column == size - (rows - 1)) {
	                	//it will print "*" when condition will be true
	                      System.out.print("*");                                 
	                  }                                                          
	                   else {   
	                	   // when the above  statement will be true it will print space
	                       System.out.print(" ");                                
	                   }                                                         
	               }    //nested for loop closed                                                         
	        System.out.println(); //it will take the cursor to the next line
	        } // main for loop closed
	    } // main method closed   
	}  // class closed

