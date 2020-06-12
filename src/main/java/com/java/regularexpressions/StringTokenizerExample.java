package com.java.regularexpressions;

import java.util.StringTokenizer;

public class StringTokenizerExample {

    public static void main(String[] args) {

        StringTokenizer myToken1 = new StringTokenizer("This is Bharath");
        while(myToken1.hasMoreTokens()){
            System.out.println(myToken1.nextToken());
        }

        System.out.println("--------------------");

        StringTokenizer myToken2 = new StringTokenizer("www.facebook.com","\\.");
        while(myToken2.hasMoreTokens()){
            System.out.println(myToken2.nextToken());
        }
    }
}
