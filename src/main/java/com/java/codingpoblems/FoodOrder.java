package com.java.codingpoblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FoodOrder {
    public static void main(String[] args) {

        //       List<String> foodOrdered = new ArrayList<>(10);
        Map<String, Integer> foodOrdered = new HashMap<>();
        Scanner text = new Scanner(System.in);
        String yesOrNo;
        do {
            System.out.println("Please order your food: ");
            String food = text.nextLine().toUpperCase();

            if (foodOrdered.containsKey(food)) {
                int count = foodOrdered.get(food) + 1;
                foodOrdered.put(food, count);
            } else {
                foodOrdered.putIfAbsent(food,1);
            }


            System.out.println("Do you want to order more: (Yes or No) ");
            yesOrNo = text.nextLine();

        } while (yesOrNo.equalsIgnoreCase("yes"));

        System.out.println("food ordered so far ");
        for (Map.Entry<String, Integer> map : foodOrdered.entrySet()) {
            System.out.println("Number of " + map.getKey() + "(s) ordered are : " + map.getValue());
        }

//for map u have to use iterator
    }
}