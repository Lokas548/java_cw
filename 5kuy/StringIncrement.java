package org.example;

// Your job is to write a function which increments a string, to create a new string.
// If the string already ends with a number, the number should be incremented by 1.
// If the string does not end with a number. the number 1 should be appended to the new string.

public class StringIncrement {

    public static String sum(String a, String b){
        int carry = 0;
        String result = "";
        int ls = a.length() - 1;
        int rs = b.length() - 1;
        while(ls >= 0 || rs >= 0 || carry > 0){
            int sum = carry;
            if(ls >= 0){
                sum += a.charAt(ls--) - '0';
            }
            if(rs >= 0){
                sum += b.charAt(rs--) - '0';
            }
            result+=String.valueOf(sum % 10);
            carry = sum/10;

        }
        String r = "";

        for (int i = result.length() - 1; i >= 0 ; i--) {
            r += result.charAt(i);
        }
        return r;
    }

    public String incrementString(String str){
        String number = "";
        String word = "";

        if(str == ""){
            return "1";
        }

        for(int i = str.length() - 1; i >=0 ;i--){
            long a = str.charAt(i);
            if(!(a >= 48 && a <= 57)){
                word = str.substring(0,i + 1);
                break;
            }
            else{
                number += str.charAt(i);
            }
        }
        String r = "";

        for (int i = number.length() - 1; i >= 0 ; i--) {
            r += number.charAt(i);
        }

        if(number == ""){
            number = "0";
        }

        r = sum(r,"1");

        return word + r;
    }
}
