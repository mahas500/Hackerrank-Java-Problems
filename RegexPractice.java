package com.practice;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {

   private static final String REGEX = "\\bcat\\b";
   private static final String INPUT = "cat cat cat cattie cat";
   static String str="cat";

   public static void main( String args[] ) {
      Pattern p = Pattern.compile(REGEX);
      
      if(p.equals(str)) {
    	  System.out.println("Yes");
      }
      else {
    	  System.out.println("No");
      }
      Matcher m = p.matcher(INPUT);   // get a matcher object
      int count = 0;

      while(m.find()) {
         count++;
         System.out.println("Match number "+count);
         System.out.println("start(): "+m.start());
         System.out.println("end(): "+m.end());
      }
   }
}