package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_9_StringLexoArray 
{

    public static String getSmallestAndLargest(String s, int k) 
    {
    	
    	//String str=s.toLowerCase();
        String smallest = "";
        String largest = "";
        String arr[]=new String[s.length()-(k-1)];
        
        for(int i=0;i<arr.length;i++)
        {
            String str1=s.substring(i,i+k);
            System.out.println(str1);
            arr[i]=str1;
            
        }
        
        outerloop:
        for(int i=1;i<arr.length;i++) 
        {
        	largest=arr[0];
        	String str2=arr[i];
        	smallest=arr[1];
        	String temp="";
        	
        	innerloop:
        	for(int j=0;j<k;j++)
        	{
        	
        	if(largest.charAt(j)<smallest.charAt(j)) {
        		
        		temp=smallest;
        		smallest=largest;
        		largest=temp;
        		break innerloop;
        	}
        	
        	else if(largest.charAt(j)<str2.charAt(j))
        	{
        		largest=str2;
        		break innerloop;
        	
        	}
        	else if(smallest.charAt(j)>str2.charAt(j)) 
        	{
        		smallest=str2;
        		break innerloop;
        	}
        	
        	else if((largest.charAt(j)==smallest.charAt(j))||(largest.charAt(j)==str2.charAt(j))||(smallest.charAt(j)==str2.charAt(j)))
        	{
        		continue innerloop;
        	}
        	else 
        	{
        		break innerloop;
        	}
        	
        	}
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}