package org.example;

//Complete the solution so that it splits the string into pairs of two characters.
//If the string contains an odd number of characters then it should replace the missing second character of the final pair
//with an underscore ('_').

public class SplitStrings {
    public String[] solution(String s) {
        int index = 0;
        if(s.length() % 2 == 0){
            String[] result = new String[Math.round(s.length()/2)];
            for(int i = 0; i < s.length()-1;i+=2,index++)
                result[index] = s.substring(i,i+2);

            return result;
        }
        else{
            s+='_';
            String[] result = new String[Math.round(s.length()/2)];
            for(int i = 0; i < s.length()-1;i+=2,index++)
                result[index] = s.substring(i,i+2);

            return result;
        }
    }
}
