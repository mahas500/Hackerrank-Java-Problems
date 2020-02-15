package com.practice;

import java.io.*;
import java.util.*;

public class Problem_8_StringProblem {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int sum=A.length()+B.length();
        
        System.out.println(sum);
        
         if(A.equalsIgnoreCase(B)) {
        	System.out.println("No");
         }
         
        	else if(A.length()>B.length())
        {
        	
        	for(int i=0,j=0;i<A.length();i++,j++)
        	{

                if(A.charAt(i)>B.charAt(j))
                {
                    System.out.println("Yes");
                    break;
                }
                else if(A.charAt(i)==B.charAt(j))
                {
                	 continue;
                	 
                }
                else
                {
                    System.out.println("No");
                    break;
                }
            }
        	
        }
        else
        {
        	for(int i=0,j=0;j<B.length();i++,j++)
        	{

                if(A.charAt(i)>B.charAt(j))
                {
                    System.out.println("Yes");
                    break;
                }
                else if(A.charAt(i)==B.charAt(j))
                {
                    continue;
                }
                else
                {
                    System.out.println("No");
                    break;
                }
            }
        	
        }

        
        String result = A.substring(0,1).toUpperCase() + A.substring(1)+" "+B.substring(0,1).toUpperCase() + B.substring(1);
        
        System.out.println(result);
        
        
    }
}
