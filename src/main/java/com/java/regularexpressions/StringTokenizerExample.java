package com.java.regularexpressions;

import java.util.StringTokenizer;

public class StringTokenizerExample {

    public static void main(String[] args) {

        StringTokenizer myToken = new StringTokenizer("This is Bharath");
        while(myToken.hasMoreTokens()){
            System.out.println(myToken.nextToken());
        }
    }
}
