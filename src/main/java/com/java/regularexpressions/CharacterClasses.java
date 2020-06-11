package com.java.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClasses {

    public static void main(String[] args) {

        String myString = "a7b@2Z#9";

        // Multiple Character Search
        Pattern myPat1 = Pattern.compile("[abc]");
        Matcher myMat1 = myPat1.matcher(myString);
        System.out.println("\nMultiple Character Search");
        System.out.println("------------------------->");
        while(myMat1.find()){
            System.out.println(myMat1.start()+"--->"+myMat1.group());
        }

        // Negation of Multiple Character Search
        Pattern myPat2 = Pattern.compile("[^abc]");
        Matcher myMat2 = myPat2.matcher(myString);
        System.out.println("\nNegation of Multiple Character Search");
        System.out.println("--------------------------------------->");
        while(myMat2.find()){
            System.out.println(myMat2.start()+"--->"+myMat2.group());
        }

        // Lower Character Range Search
        Pattern myPat3 = Pattern.compile("[a-z]");
        Matcher myMat3 = myPat3.matcher(myString);
        System.out.println("\nLower Character Range Search");
        System.out.println("------------------------------>");
        while(myMat3.find()){
            System.out.println(myMat3.start()+"--->"+myMat3.group());
        }

        // Negation of Lower Character Range Search
        Pattern myPat4 = Pattern.compile("[^a-z]");
        Matcher myMat4 = myPat4.matcher(myString);
        System.out.println("\nNegation of Lower Character Range Search");
        System.out.println("------------------------------------------>");
        while(myMat4.find()){
            System.out.println(myMat4.start()+"--->"+myMat4.group());
        }

        // Upper Character Range Search
        Pattern myPat5 = Pattern.compile("[A-Z]");
        Matcher myMat5 = myPat5.matcher(myString);
        System.out.println("\nUpper Character Range Search");
        System.out.println("------------------------------>");
        while(myMat5.find()){
            System.out.println(myMat5.start()+"--->"+myMat5.group());
        }

        // Negation of Upper Character Range Search
        Pattern myPat6 = Pattern.compile("[^A-Z]");
        Matcher myMat6 = myPat6.matcher(myString);
        System.out.println("\nNegation of Upper Character Range Search");
        System.out.println("----------------------------------------->");
        while(myMat6.find()){
            System.out.println(myMat6.start()+"--->"+myMat6.group());
        }

        // Numeric Range Search
        Pattern myPat7 = Pattern.compile("[0-9]");
        Matcher myMat7 = myPat7.matcher(myString);
        System.out.println("\nNumeric Range Search");
        System.out.println("---------------------->");
        while(myMat7.find()){
            System.out.println(myMat7.start()+"--->"+myMat7.group());
        }

        // Negation of Numeric Range Search
        Pattern myPat8 = Pattern.compile("[^0-9]");
        Matcher myMat8 = myPat8.matcher(myString);
        System.out.println("\nNegation of Numeric Range Search");
        System.out.println("---------------------------------->");
        while(myMat8.find()){
            System.out.println(myMat8.start()+"--->"+myMat8.group());
        }

        // Alpha-Numeric Range Search
        Pattern myPat9 = Pattern.compile("[a-zA-Z0-9]");
        Matcher myMat9 = myPat9.matcher(myString);
        System.out.println("\nAlpha-Numeric Range Search");
        System.out.println("--------------------------->");
        while(myMat9.find()){
            System.out.println(myMat9.start()+"--->"+myMat9.group());
        }

        // Negation of Alpha-Numeric Range Search
        Pattern myPat10 = Pattern.compile("[^a-zA-Z0-9]");
        Matcher myMat10 = myPat10.matcher(myString);
        System.out.println("\nNegation of Alpha-Numeric Range Search");
        System.out.println("---------------------------------------->");
        while(myMat10.find()){
            System.out.println(myMat10.start()+"--->"+myMat10.group());
        }

    }
}
