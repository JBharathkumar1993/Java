package com.java.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PredefinedCharacterClasses {

    public static void main(String[] args) {

        String target = "a7b k@9";

        // Searches for space
        Pattern myPat1 = Pattern.compile("\\s");
        Matcher myMat1 = myPat1.matcher(target);
        System.out.println("\nSpace Search");
        System.out.println("-------------->");
        while(myMat1.find()){
            System.out.println("Start Index of matched String : "+myMat1.start()+"; Matched String : "+myMat1.group());
        }

        // Searches for except space
        Pattern myPat2 = Pattern.compile("\\S");
        Matcher myMat2 = myPat2.matcher(target);
        System.out.println("\nNegation of Space Search");
        System.out.println("-------------->");
        while(myMat2.find()){
            System.out.println("Start Index of matched String : "+myMat2.start()+"; Matched String : "+myMat2.group());
        }

        // Searches for digit
        Pattern myPat3 = Pattern.compile("\\d");
        Matcher myMat3 = myPat3.matcher(target);
        System.out.println("\nDigit Search");
        System.out.println("-------------->");
        while(myMat3.find()){
            System.out.println("Start Index of matched String : "+myMat3.start()+"; Matched String : "+myMat3.group());
        }

        // Searches for negation of digit
        Pattern myPat4 = Pattern.compile("\\D");
        Matcher myMat4 = myPat4.matcher(target);
        System.out.println("\nNegation of Digit Search");
        System.out.println("-------------->");
        while(myMat4.find()){
            System.out.println("Start Index of matched String : "+myMat4.start()+"; Matched String : "+myMat4.group());
        }

        // Searches for word (Alpha-Numeric)
        Pattern myPat5 = Pattern.compile("\\w");
        Matcher myMat5 = myPat5.matcher(target);
        System.out.println("\nWord Search");
        System.out.println("-------------->");
        while(myMat5.find()){
            System.out.println("Start Index of matched String : "+myMat5.start()+"; Matched String : "+myMat5.group());
        }

        // Searches for negation of word (Alpha-Numeric)
        Pattern myPat6 = Pattern.compile("\\W");
        Matcher myMat6 = myPat6.matcher(target);
        System.out.println("\nNegation of Word Search");
        System.out.println("-------------->");
        while(myMat6.find()){
            System.out.println("Start Index of matched String : "+myMat6.start()+"; Matched String : "+myMat6.group());
        }

        // Searches for Any character (Alpha-Numeric & Special Character)
        Pattern myPat7 = Pattern.compile(".");
        Matcher myMat7 = myPat7.matcher(target);
        System.out.println("\nAny Character Search");
        System.out.println("-------------->");
        while(myMat7.find()){
            System.out.println("Start Index of matched String : "+myMat7.start()+"; Matched String : "+myMat7.group());
        }
    }
}
