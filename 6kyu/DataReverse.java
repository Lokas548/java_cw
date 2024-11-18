package org.example;

import java.util.ArrayList;

public class DataReverse {
    public static int[] DataReverse(int[] data) {
        ArrayList<Integer> indexes = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < data.length; i++) {
            if(i % 8 == 0){
                indexes.add(i);
            }
        }
        indexes.add(data.length);

        for (int i = indexes.size() - 1; i >0; i--) {
            for (int j = indexes.get(i-1); j < indexes.get(i); j++) {
                ans.add(data[j]);
            }
        }

        for (int i = 0; i < data.length; i++) {
            data[i] = ans.get(i);
        }

        return data;
    }
}

