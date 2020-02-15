package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_10_StringLexoArray_2 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        String[] substrArray = new String[s.length() - (k - 1)];

        for (int i = 0; i < s.length() - (k - 1); i++) {
            substrArray[i] = s.substring(i, i + k);
            System.out.println(Arrays.toString(substrArray));
        }

        for (int j = 0; j < substrArray.length; j++) {
            for (int i = 0; i < substrArray.length - 1; i++) {
                for (int h = 0; h < k; h++) {
                    if (substrArray[i].charAt(h) > substrArray[i + 1].charAt(h)) {
                        String tmp = substrArray[i];
                        substrArray[i] = substrArray[i + 1];
                        substrArray[i + 1] = tmp;
                        break;
                    } else if(substrArray[i].charAt(h) < substrArray[i + 1].charAt(h))
                        break;
                }
            }
        }

        smallest = substrArray[0];
        largest = substrArray[substrArray.length - 1];

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