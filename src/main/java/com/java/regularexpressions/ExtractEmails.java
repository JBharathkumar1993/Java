package com.java.regularexpressions;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {

    public static void main(String[] args) {
        String info = "Ebill dated 27-May-19 bill for your airtel mobile will be sent to bharathkumar19900@gmail.com shortly. Your ebill password (all lower case) is odg1. To continue receiving ebills, SMS STOP PAPER <your email id> to 121 from your airtel mobile.";
        Pattern myPat1 = Pattern.compile("[A-Za-z0-9]+@[a-zA-Z0-9]+[.][a-zA-z]+");
        Matcher myMat1 = myPat1.matcher(info);
        while(myMat1.find()){
            System.out.println(myMat1.group());
        }

        String emailInfo = "My 1st EmailId is kumar_2019@gmail.com, Facebook mailid is facebook.20201@outlook.org, Alternative facebook mailid is facebook_20201@outlook.org.in";
        Pattern myPat2 = Pattern.compile("[A-Za-z0-9_.]+@[a-zA-Z0-9]+([.][a-zA-z]+)+");
        Matcher myMat2 = myPat2.matcher(emailInfo);
        while(myMat2.find()){
            System.out.println(myMat2.group());
        }
    }
}
