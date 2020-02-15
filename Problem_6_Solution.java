package com.practice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.*;

public class Problem_6_Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner input=new Scanner(System.in);
        //int n=input.nextInt();
        int count=0;
       /* for(int i=0;i<n;i++)
        {	
        	input.nextLine();
            String str=input.nextLine();
            count=count+1;
            System.out.println(count+" "+str);
        }
        */
        while(input.hasNext()) {
        	//String str=input.nextLine();
            count++;
            System.out.println(count+" "+input.nextLine());
           
        }


    }
}
