package org.example;

import java.util.ArrayList;

//Write a function that takes a string of braces, and determines if the order of the braces is valid. It should return true if the string is valid, and false if it's invalid.
//This Kata is similar to the Valid Parentheses Kata, but introduces new characters: brackets [], and curly braces {}. Thanks to @arnedag for the idea!
//All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.
public class BracesValidation {
    public static boolean isValid(String braces) {
        ArrayList<Character> arr = new ArrayList<>();

        for (int i = 0; i < braces.length(); i++) {
            char current = braces.charAt(i);
            if (current == '(' || current == '[' || current == '{') {
                arr.add(current);
            }
            else if (current == ')' || current == ']' || current == '}') {
                if (arr.size() == 0) {
                    return false;
                }

                char last = arr.remove(arr.size() - 1);

                if ((current == ')' && last != '(') || (current == ']' && last != '[') || (current == '}' && last != '{')) {
                    return false;
                }
            }
        }

        return arr.isEmpty();
    }
}
