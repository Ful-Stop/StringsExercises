package com.company;

public class Strings {
    public static String scroll(String s){
        String scrollS = "";
        for (int i = 1; i < s.length(); i++){
            scrollS += s.charAt(i);
        }
        scrollS += s.charAt(s.length() - 1);
        return scrollS;
    }

    public static String convertName(String s){
        String sTrim = s.trim();
        String firstName = sTrim.substring(sTrim.indexOf(',') + 1, sTrim.length());
        String lastName = sTrim.substring(0, sTrim.indexOf(","));
        return (firstName + " " + lastName).trim();
    }

    public static String negative(String binaryS){
        String flipBinaryS = binaryS;
        flipBinaryS = flipBinaryS.replace("0", "O");
        flipBinaryS = flipBinaryS.replace("1", "I");
        flipBinaryS = flipBinaryS.replace("O", "1");
        flipBinaryS = flipBinaryS.replace("I", "0");
        return flipBinaryS;
    }


    public static void main(String[] args) {
        //scroll
        System.out.println(scroll("Hello World"));
        System.out.println(scroll("happy"));
        System.out.println(scroll("h"));

        System.out.println("");

        //convertName
        System.out.println(convertName(" Reubenstein, Lori Renee "));
        System.out.println(convertName("Biden,Joe"));
        System.out.println(convertName("the Clown, Bozo"));

        System.out.println("");

        //negative
        System.out.println(negative("0010111001"));
        System.out.println(negative("11111111"));
        System.out.println(negative("00000000"));

        System.out.println("");

    }
}
