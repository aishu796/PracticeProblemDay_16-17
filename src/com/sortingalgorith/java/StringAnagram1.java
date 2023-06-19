package com.sortingalgorith.java;

import java.util.Arrays;

public class StringAnagram1
{
    public static void main(String[] args) {
        String x="She is aishwarya";
        String y="she is AIShwarya";
        x=x.replace(" ","");
        y=y.replace(" ","");

        x=x.toLowerCase();
        y=y.toLowerCase();

        char a[]=x.toCharArray();
        char b[]=y.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        boolean result=Arrays.equals(a,b);
        if(result==true)
        {
            System.out.println("Strings are Anagram");

        }
        else {
            System.out.println("Strings are not anagram");
        }

    }
}
