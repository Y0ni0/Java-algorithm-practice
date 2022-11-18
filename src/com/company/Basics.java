package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Basics {
    public static void Basic(){
        char vowels[] = {'e', 'u', 'a', 'o', 'i'};

//        vowels[0] = 'a';
//        vowels[1] = 'e';
//        vowels[2] = 'i';
//        vowels[3] = 'o';
//        vowels[4] = 'u';
//        int startingIndex = 1;
//        int endingIndex = 4;
//        Arrays.sort(vowels, startingIndex, endingIndex);
        Arrays.sort(vowels);
        char key = 'o';
        int foundItemIndex = Arrays.binarySearch(vowels, key);
        System.out.println(Arrays.toString(vowels));
        System.out.println(vowels.length);
        System.out.println(foundItemIndex);
        Arrays.fill(vowels, 'x');
        System.out.println(Arrays.toString(vowels));

        String word = "Hello";

        System.out.println(word.replace("H", "B"));
        String name1 = "Yona2than";
        String name2 = "Yona2than";
        System.out.println(name2);

        boolean comparison = name1 == name2;
        System.out.println(comparison);



    }
}
