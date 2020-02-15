package com.practice;

import java.util.Scanner;

public class Problem_3_ExtractIntegerFromString {

	static String extractInt(String str) 
    { 
        // Replacing every non-digit number 
        // with a space(" ") 
        str = str.replaceAll("[^\\d]", " "); 
        
        System.out.println("1st string is: "+str);
  
        // Remove extra spaces from the beginning 
        // and the ending of the string 
        str = str.trim(); 
  
        // Replace all the consecutive white 
        // spaces with a single space 
        str = str.replaceAll(" +", " "); 
  
        if (str.equals("")) 
            return "-1"; 
  
        return str; 
    } 
  
    
    public static void main(String[] args) 
    { 
        String str = "avbkjd1122klj4 543 af"; 
        System.out.print(extractInt(str)); 
    } 
}
