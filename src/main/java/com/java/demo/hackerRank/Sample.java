package com.java.demo.hackerRank;

import javafx.util.Pair;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sample {
    public static void main(String[] args) throws IOException {
        List<Integer> list = Arrays.asList(3,3,1,2);
        int swaps = minimumSwaps(list);
        System.out.println("swaps - " + swaps);



    }

    public static int minimumSwaps(List<Integer> popularity) {
        // Write your code here
        Integer arr[] = popularity.toArray(new Integer[0]);
        int n = arr.length;


        ArrayList<Pair<Integer, Integer>> arrayPosition =
                new ArrayList<Pair<Integer, Integer>>();
        for (int i = 0; i < n; i++)
            arrayPosition.add(new Pair<Integer, Integer>(arr[i], i));

        arrayPosition.sort(new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> o1,
                               Pair<Integer, Integer> o2) {
                if (o1.getKey() > o2.getKey())
                    return -1;


                else if (o1.getKey().equals(o2.getKey()))
                    return 0;

                else
                    return 1;
            }
        });


        Boolean[] vis = new Boolean[n];
        Arrays.fill(vis, false);


        int minimumSwaps = 0;

        for (int i = 0; i < n; i++) {
            if (vis[i] || arrayPosition.get(i).getValue() == i)
                continue;
            int cycle_size = 0;
            int j = i;
            while (!vis[j]) {
                vis[j] = true;
                j = arrayPosition.get(j).getValue();
                cycle_size++;
            }
            if (cycle_size > 0) {
                minimumSwaps += (cycle_size - 1);
            }
        }
        return minimumSwaps;
    }
}

