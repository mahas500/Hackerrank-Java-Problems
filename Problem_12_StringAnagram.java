package com.practice;

//import java.util.Arrays;
import java.util.Scanner;

public class Problem_12_StringAnagram {

    static boolean isAnagram(String a, String b) {
    	
		boolean bool=false;
		
		String str1=a.toLowerCase();
		String str2=b.toLowerCase();
		
		char ch1[]=new char[str1.length()];
		
		char ch2[]=new char[str2.length()];
		
		for(int i=0;i<str1.length();i++) 
		{
			ch1[i]=str1.charAt(i);
			
		}
		
		java.util.Arrays.sort(ch1);
		String str3 = String.valueOf(ch1);
		
		for(int i=0;i<str2.length();i++) 
		{
			ch2[i]=str2.charAt(i);
			
		}
		
		java.util.Arrays.sort(ch2);
		//System.out.println(ch2);
		
		String str4 = String.valueOf(ch2);
		
		if(str3.contentEquals(str4)) {
			bool=true;
		}
		else {
			bool=false;
		}
		
		return bool;
		
		}
		

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
