package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class NonRepeting {


    public static int nonRepetingIndex1(String s) {
        for (int i=0;i<s.length();i++) {
            int c = 0;
            for (int j=1+1;j<s.length();j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    c++;
                }
            }
            if (c == 0) {
                return i;
            }
        }
        return -1;
    }

    public static int nonRepetingIndex(String s) {
        int nonRepeat =-1;
        char[] ch = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(s.indexOf(ch[i]) == s.lastIndexOf(ch[i])){
                nonRepeat = i;
                break;
            }
        }
        return nonRepeat;
    }

    public static void main(String[] args) {
        String s = "abccdaebfd";
        System.out.println(nonRepetingIndex(s));
    }
}
