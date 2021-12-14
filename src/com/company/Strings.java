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

    public static String convertDate(String dateOrig){
        return dateOrig.substring(3, 5) + "/" + dateOrig.substring(0, 2) + "/" + dateOrig.substring(6);
    }

    public static String convertDate2(String dateOrig2){
        String dateEuro = "";
        if (dateOrig2.charAt(dateOrig2.indexOf("/") + 1) == ('0')){
            dateEuro += dateOrig2.charAt(dateOrig2.indexOf("/") + 2) + "/";}
        else{
            dateEuro += dateOrig2.substring(dateOrig2.indexOf("/") + 1, dateOrig2.lastIndexOf("/")) + "/";}
        if (dateOrig2.charAt(0) == ('0')){
            dateEuro += dateOrig2.charAt(1) + "/";}
        else{
            dateEuro += dateOrig2.substring(0, dateOrig2.indexOf("/")) + "/";}
        return dateEuro + dateOrig2.substring(dateOrig2.length() - 4, dateOrig2.length());
        }

    public static boolean startsWith(String s, String prefix){
        if (prefix.length() > s.length()){
            return false;}
        else{
            return s.substring(0, prefix.length()).equals(prefix);}
    }

    public static boolean endsWith(String s, String suffix){
        if (suffix.length() > s.length()){
            return false;}
        else{
            return s.substring(s.length() - suffix.length(), s.length()).equals(suffix);}
        }

    public static String removeTag(String s, String tag){
        if (s.substring(s.indexOf("<") + 1, s.indexOf(">")).equals(tag) && s.substring(s.indexOf("/") + 1, s.lastIndexOf(">")).equals(tag)){
            return s.substring(0, s.indexOf("<")) + s.substring(s.indexOf(">") + 1, s.lastIndexOf("<")) + s.substring(s.lastIndexOf(">") + 1, s.length());}
        else{
            return s;
        }
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

        //convertString

        System.out.println(convertDate("04/20/2014"));

        System.out.println("");

        //convertString2

        System.out.println(convertDate2("04/20/2014"));
        System.out.println(convertDate2("4/20/2014"));
        System.out.println(convertDate2("04/2/2014"));
        System.out.println(convertDate2("4/2/2014"));

        System.out.println("");

        //startsWith

        System.out.println(startsWith("architecture", "arch"));
        System.out.println(startsWith("architecture", "a"));
        System.out.println(startsWith("arch", "architecture"));
        System.out.println(startsWith("architecture", "rch"));
        System.out.println(startsWith("architecture", "architecture"));

        System.out.println("");

        //endsWith

        System.out.println(endsWith("astronomy", "nomy"));
        System.out.println(endsWith("astronomy", "y"));
        System.out.println(endsWith("astronomy", "nom"));
        System.out.println(endsWith("nomy", "astronomy"));
        System.out.println(endsWith("astronomy", "astronomy"));

        System.out.println("");

        //removeTag

        System.out.println(removeTag("<b>Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World</b>", "head"));
        System.out.println(removeTag("Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World", "b"));
        System.out.println(removeTag("</img>Hello World<img>", "img"));
        System.out.println(removeTag("Happy Birthday <b>Hello World</b>", "b"));
        System.out.println(removeTag("<title>Hello World</title> Happy Birthday",
                "title"));
        System.out.println(removeTag("Happy <b>Hello World</b> Birthday", "b"));
    }
}
