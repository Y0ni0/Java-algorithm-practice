package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {


    //Encode a number
    public static int[] encodeNumber(int n){
        if(n<=1) return null;
        List<Integer> primeFactors = new ArrayList();

        for(int i=0; i<n; i++){
            while(n%i==0) primeFactors.add(i);
            n = n/i;
        }
        if(n > 1) primeFactors.add(n);
        int[] arraysToReturn = new int[primeFactors.size()];
        for(int i=0; i<primeFactors.size(); i++){
            arraysToReturn[i] = primeFactors.get(i);
        }
        return arraysToReturn;
    }

    //largest adjacent sum
    public static int largestAdjacentSum(int[] a){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<a.length -1; i++){
            if(a[i] + a[i+1] > max){
                max = a[i] + a[i+1];
            }
        }
        return max;
    }
    //largest prime factor
    public static int largestPrimeFactor(int num){
        if(num <= 1) return 0;
        int number = num;
        while(number > 1){
            if(num % number == 0){
                boolean isPrime = true;
                for(int i=2; i<number; i++){
                    if(number % i == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime) return number;
            }
            number --;
        }
        return 0;
    }
    //largest factor of a number
    public static int largestFactor(int number){
       if(number == 0) return 0;
       else if (number == 1) return 1;
       int i = 2;
       while(i <= number ){
           if(number % i == 0 ) return number/i;
           else i++;
       }
        return 0;
    }
        //mn sequenced array
    public static int isSequencedArray(int[] a, int m , int n){
        if(a[0]!=m && a[a.length-1]!=n) return 0;

        for (int i=0; i<a.length-1; i++){
          if(a[i+1] - a[i]!=0 && a[i+1] - a[i]!=1 ) return 0;
        }

            return 1;
    }
    public static void main(String[] args) {

//        System.out.println(largestPrimeFactor(10));
//        System.out.println(largestPrimeFactor(6936));
//        System.out.println(largestPrimeFactor(1));
        //System.out.println(largestFactor(1));
    /*
        int example1 = isSequencedArray(new int[] {1,2,3,4,5},1,5);
        int example2 = isSequencedArray(new int[] {1,3,4,2,5},1 ,5);
        int example3 = isSequencedArray(new int[] {-5,-5,-4,-4,-3,-3,-2,-2,-2},-5,-2);
        int example4 = isSequencedArray(new int[] {0,1,2,3,4,5},1,5);
        int example5 = isSequencedArray(new int[] {1,2,3,4},1,5);
        int example6 = isSequencedArray(new int[] {1,2,5}, 1,5);
            System.out.println("Example 1: " + example1);
            System.out.println("Example 2: " + example2);
            System.out.println("Example 3: " + example3);
            System.out.println("Example 4: " + example4);
            System.out.println("Example 5: " + example5);
            System.out.println("Example 6: " + example6);
     */
    }
}
