package org.example;

public class HighestScore {
    public static String high(String s) {
        int score = 0;
        int highest = 0;
        int winnerId = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' '){
                score += (int) s.charAt(i);
            }
            else{
                if(score > highest){
                    highest = score;
                    winnerId = i;
                }
                score = 0;
            }
        }
        winnerId--;

        while(s.charAt(winnerId) != ' '){
            sb.append(s.charAt(winnerId));
            System.out.println(s.charAt(winnerId));
            winnerId--;
        }

        return sb.reverse().toString();
    }
}
