package org.example;

import org.apache.commons.lang3.StringUtils;

public class CountCharacterOrString {
    public static void main(String[] args) {
        String string = "welcome to www.baeldung.com";
        char a ='b';
        int charNum = StringUtils.countMatches(string,String.valueOf(a));
        int stringNum = StringUtils.countMatches(string, "com");
        System.out.println("no of occurence is : "+ charNum);
        System.out.println("no of occurence is :" + stringNum);
    }
}
