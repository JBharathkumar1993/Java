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

        Pattern myPat2 = Pattern.compile("a*");
        Matcher myMat2 = myPat2.matcher(target);
        System.out.println("\nAny number of times search");
        System.out.println("-------------------------->");
        while(myMat2.find()){
            System.out.println("Start Index of matched String : "+myMat2.start()+"; Matched String : "+myMat2.group());
        }

        Pattern myPat3 = Pattern.compile("a?");
        Matcher myMat3 = myPat3.matcher(target);
        System.out.println("\nAtmost 1 a means 1 a or 0 a's");
        System.out.println("------------------------------>");
        while(myMat3.find()){
            System.out.println("Start Index of matched String : "+myMat3.start()+"; Matched String : "+myMat3.group());
        }

    }
}
