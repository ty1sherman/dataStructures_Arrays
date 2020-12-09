package com.tts.dataStructures;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.*;

/*This project does the following: 
 * Write a program to sum all the values of a given Array in Java.
 * find the output of a given problem.
 * Write a public static method called "toPower" that takes in as parameters 
 * two integers called size and power. The method should return an array of size 
 * "size" with each array index raised to the value of "power." So, for example, 
 * if we passed in "size = 4" and "power = 2" to the "toPower," the method should 
 * return the following result: [0,1,4,9].
 * 		
 *@author Nelson T. Sherman
 *Date: 12/7/2020
 */

public class DataStructures_Arrays {

//method
	public static class dataArrays {
		
		public static int toPower(int size, int power) {
			
			// Declaring and defining an int array 
	       int myArr[] = new int[size]; 
	        
	        int results = 1;
	        // Traversing the array 
	        for (int i = 0; i < myArr.length; i++) { 
	  
	            // Array.get method 
	            // Note : typecasting is essential as the return type in Object. 
	        		double j = (power);
	        		myArr[i] = (int) (Math.pow(i,j));
	        	
	            results = myArr[i];
	            // Printing the values 
	            System.out.print(myArr[i] +" "); 
	        }
	        
	        return results;
	       			 
		}
	}

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
// Write a program to sum all the values of a given Array in Java.		
		//Variables
		int sum=0, i;
		
		//create an Array of numbers
		int[] mathArray ={2, 6, 3, 7,10};
		
		//loop the Array to find the sum
		for(i=0; i< mathArray.length; i++)
		{
			sum += mathArray[i];
		}
		
		System.out.println("The sum of the numbers in the Array is: " +sum +"\n");

/*
//What is the output?
        double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = examplesArray[0];

        int index = 0;

        for (int i = 1; i<exampleArray.length>; i++){

             if (exampleArray[ i ] > maximum) {

                  maximum = exampleArray[ i ];

                  index = i;
             }
        }

        System.out.println(index);
*/		
       System.out.println("the ANSWER to ques #2, output cannot be reached, there is an error in the way the code is written. \n");
	
		
		
//calling method to return and array size and raised to the value of power
		
		//Variables
		
		double results;
		
		 
		System.out.println(dataArrays.toPower(4,2));
        
	}

}


