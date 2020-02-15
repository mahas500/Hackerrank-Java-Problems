package com.practice;

import java.util.Scanner;

public class Problem_4_Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                String blank=" ";
                for(int j=0;j<8;j++){
                    blank=blank+" ";
                }
                
                int x=sc.nextInt();
                //Complete this line
                int count=0;
                int a=0;

                String str=Integer.toString(x);
                
                if(str.length()<3)
                {
                    str=Integer.toString(a)+str;
                    String total=s1+blank+str;
                    System.out.println(s1+blank+str);
                    System.out.println(total.length());
                    
                }
                else
                {
                    System.out.println(s1+blank+str);
                }

            }
            System.out.println("================================");

    }
}