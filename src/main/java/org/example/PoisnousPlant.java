package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PoisnousPlant {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(6 ,5, 8, 4 ,7 ,10, 9);
        int currlength;
        int newlength = arr.size();
        int days = 0;
        List<Integer> p;
        do {
            int currindex = 1;
            p = new ArrayList<>();
            p.add(arr.get(0));
            while (currindex < newlength){
                if (arr.get(currindex-1) >= arr.get(currindex)){
                    p.add(arr.get(currindex));
                }
                currindex +=1;
            }
            currlength = arr.size();
            newlength = p.size();
            if (currlength != newlength){
                    days+=1;
            }
            arr = p;
        } while (currlength != newlength && currlength > 1);
            System.out.println("days since plant is active" + days);
    }

}
