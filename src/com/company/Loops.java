package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Loops {
    public static String[] reverseArray(String[] lastName){
        String[] reversedArray = new String[lastName.length];
        int j = 0;
        for(int i = lastName.length-1; i>=0; i--){
           reversedArray[j] = lastName[i];
           j++;
        }

        return reversedArray;
    }

    public static int[] findMinMax(int[] listOfNum){
        int min = listOfNum[0];
        int max = listOfNum[0];
        for (int i = 0; i < listOfNum.length; i++) {
            if(listOfNum[i] < min ){
                min = listOfNum[i];
            }
            if(listOfNum[i] > max){
                max = listOfNum[i];
            }
        }
        int[] minMaxHolder = {min, max};
       return minMaxHolder;
    }
    public static void Loops() {

         int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        System.out.println(Arrays.toString(numbers));

        String[] names = {"Abebe", "Kebede", "chala"};
        String firstName = "";
        for(int i= names.length -1 ; i>=0 ; i--){
            firstName += names[i] + " ";
        }
        System.out.println(firstName);
        System.out.println(Arrays.toString(reverseArray(names)));

        int[] minMax = {3 , 9, 34, 67, 5, 6 };
        int[] randomArray = new int[] {1, 5 ,6 , 8};
        System.out.println(Arrays.toString(findMinMax(minMax)));
        
        //Printing out the multiplication table

//        for(int i=1; i<=10;i++){
//            for(int j=1; j<=10; j++){
//                System.out.printf("%d x %d = %d \n", i, j, i*j);
//            }
//        }
//    }
        //printing out all the odd numbers from 1 -5
//        for (int num=0; num<=50; num++){
//            if(num%2 == 1) System.out.printf(num + " ");
////        }
//        System.out.println();
//        //Array list
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(2);
//        numbers.add(2);
//
//        System.out.println(numbers.get(0));
//        numbers.remove(Integer.valueOf(2));
//        System.out.println(numbers.toString());
//        System.out.println(numbers.get(2));
//       // numbers.clear();
//        numbers.set(2, Integer.valueOf(45));
//
//        numbers.sort(Comparator.reverseOrder());
//        System.out.println(numbers.toString());
//        System.out.println(numbers.size());
//        System.out.println(numbers.contains(Integer.valueOf(45)));
//        System.out.println(numbers.isEmpty());
//
//        //Foreach loop
//        numbers.forEach(number -> {
//            System.out.println(number * 2);
//        });
        //HashMap examples
//        HashMap<String, Integer> examScore = new HashMap<>();
//        examScore.put("Biology", 87);
//        examScore.put("Geography", 98);
//        examScore.put("Economics", 76);
//        examScore.put("Math", 77);
//        examScore.put("Chemistry", 90);
//        System.out.println(examScore.toString());
//        examScore.forEach((subject, score) -> {
//            System.out.println(subject + " " + score);
//        });

        //decode array


    }

}