package com.practice;

import java.io.*;
import java.util.*;

public class Problem_11_String_Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
       // char ch=A.charAt(0);
       // char ch;
        String str1="";
        
        
        for(int j=A.length()-1;j>=0;j--)
        {
        	//System.out.println(A.charAt(j));
        	str1=str1+A.charAt(j);
        	
        	
        }
       // System.out.println(str1);
        
        if (A.contentEquals(str1)) {
        	System.out.println("Yes");
        }
        else {
        	System.out.println("No");
        }
        
    }
}
