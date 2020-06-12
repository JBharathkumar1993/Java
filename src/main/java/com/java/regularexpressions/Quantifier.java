package com.java.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifier {

    public static void main(String[] args) {

        String target = "abaabaaab";
        Pattern myPat1 = Pattern.compile("a+");
        Matcher myMat1 = myPat1.matcher(target);
        System.out.println("\nAtleast 1 search");
        System.out.println("--------------->");
        while(myMat1.find()){
            System.out.println("Start Index of matched String : "+myMat1.start()+"; Matched String : "+myMat1.group());
        }

        // Here last b's index is 8 but cursor executed till 9th position as we know cursor moves to index.length()+1 in matcher method which indicates 0 match
        Pattern myPat2 = Pattern.compile("a*");
        Matcher myMat2 = myPat2.matcher(target);
        System.out.println("\nAny number of times search");
        System.out.println("-------------------------->");
        while(myMat2.find()){
            System.out.println("Start Index of matched String : "+myMat2.start()+"; Matched String : "+myMat2.group());
        }

        // Here last b's index is 8 but cursor executed till 9th position as we know cursor moves to index.length()+1 in matcher method which indicates 0 match
        Pattern myPat3 = Pattern.compile("a?");
        Matcher myMat3 = myPat3.matcher(target);
        System.out.println("\nAtmost 1 a means 1 a or 0 a's");
        System.out.println("------------------------------>");
        while(myMat3.find()){
            System.out.println("Start Index of matched String : "+myMat3.start()+"; Matched String : "+myMat3.group());
        }

    }
}
