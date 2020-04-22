package com.java.demo.hackerRank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Titles {
    public static void main(String[] args) {
        String substr = "";
        getMovieTitles(substr);
    }

    private static void getMovieTitles(String subStr) {
        String response;
        int startPage = 1;
        int totalPages = Integer.MAX_VALUE;
        List<String> titles = new ArrayList<>();
        while (startPage <= totalPages) {
            try{
                URL obj = new URL("https://jsonmock.hackerrank.com/api/movies/search/?Title=" + subStr + "&page=" + startPage);
                HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
                connection.setRequestMethod("GET");
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }


}
