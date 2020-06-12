package com.java.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractMobileNumber {

    public static void main(String[] args) {

        String str = "My Mobile number is 9898888888, Alternate number is 919898987779";
        System.out.println("--------1st Way----------");
        Pattern myPat1 = Pattern.compile("[7-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
        Matcher myMat1 = myPat1.matcher(str);
        while(myMat1.find()){
            System.out.println(myMat1.group());
        }

        System.out.println("--------2nd Way----------");
        Pattern myPat2 = Pattern.compile("[7-9][0-9]{9}$");
        Matcher myMat2 = myPat2.matcher(str);
        while(myMat2.find()){
            System.out.println(myMat2.group());
        }

        System.out.println("--------3rd Way----------");
        Pattern myPat3 = Pattern.compile("[789][0-9]{9}");
        Matcher myMat3 = myPat3.matcher(str);
        while(myMat3.find()){
            System.out.println(myMat3.group());
        }
    }
}
