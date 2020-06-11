package com.java.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindIndexOfOccurence {

    public static void main(String[] args) {

        int countOfOccurences = 0;
        // Create a pattern object with which pattern we want to search on.
        Pattern myPat = Pattern.compile("ab");
        //We have to create a Matcher object by calling matcher method on the Pattern object providing the Target String to method parameter to perform pattern matching.
        Matcher myMat = myPat.matcher("babaababbab");

        // If found enter
        while(myMat.find()){
            countOfOccurences++;
            // Display the occurence index
            System.out.println(myMat.start());
        }

        // Number of Occurences
        System.out.println("Total count : "+countOfOccurences);
    }
}
