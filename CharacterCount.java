package com.company;

import java.util.*;
import java.lang.*;


public class CharacterCount {
    public static int[] characterCount(String input) {
        int []atozArray = new int[26];
        input = input.toLowerCase();     //changes all letters in string to lower case
        for(int i = 0 ; i < input.length() ; i++) {
            atozArray[input.charAt(i) - 97] += 1;
        }
        return atozArray;
    }
    public static boolean containsAllLetters(int []array) {
        for (int value : array) {
            if (value < 1)
                return false;
        }
        return true;
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if(containsAllLetters(characterCount(input)))
            System.out.println("Contain all alphabets");
        else
            System.out.println("Doesn't contain all alphabets");
    }
}


//time complexicity : input string length(n) + array length(26) ~ O(n)
//space complexiciy : Array of length 26