package com.company;

import java.util.*;
//import java.util.LinkedList;


public class Main {


    //Encode a number
    public static int[] encodeNumber(int n){
        if(n<=1) return null;
        ArrayList<Integer> primeFactors = new ArrayList();

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
    //largest adjacent sum 2
    public static int largestAdjacentSum2(int [] a){
        int largestSum = Integer.MIN_VALUE;
        for(int i=0; i<a.length-1; i++){
            if(a[i] + a[i+1]> largestSum){
                largestSum = a[i] + a[i+1];
            }
        }
        return largestSum;
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
    //Check Concatenated sum
    public static int checkConcatenatedSum(int n, int catLen){
        int originalNum = n;
        int totalSum = 0;
        while(n!=0){
            int digit = n%10;
            int concatNum = 0;
            for (int i=0; i<catLen; i++){
                concatNum = (concatNum*10) + digit;
            }
            totalSum += concatNum;
            n= n/10;
        }
        return originalNum == totalSum ? 1 : 0;
    }
        public static int decodeArray(int [] a){
            int encodedNum = 0;
            for(int i=0; i<a.length-1; i++){
                int digit = Math.abs(a[i] - a[i+1]);
                encodedNum = encodedNum*10 + digit;
            }
            if (a[0]<0) return encodedNum * -1;
            return encodedNum;
        }
    //is m-n sequenced array
    public static int isSequencedArray2(int[] a, int m, int n){
       if(a[0]!=m || a[a.length-1]!=n) return 0;

       for(int i=0; i<a.length-1; i++){
           if(a[i+1] - a[i]!=0 && a[i+1] - a[i]!= 1) return 0;
       }
        return 1;
    }
    //largest prime factor
    public static int largestPrimeFactor2(int n){
        if(n<=1) return 0;
        int num = n;
        while(num >1 ){
            if(n % num ==0){
                boolean isPrime = true;
                for(int i=2 ; i<n; i++){
                    if(num %i ==0 ){
                        isPrime =false;
                        break;
                    }
                }
                if(isPrime) return num;
            }
            num--;
        }
        return 0;
    }
    //encode a number
    public static int[] encodeNumber2(int n){
        if(n<=1) return null;
        ArrayList<Integer> primeFactors = new ArrayList<>();
        for(int i=2; i<n; i++){
            while(n%i==0){
               primeFactors.add(i);
               n= n/i;
            }
        }
        if(n>1) primeFactors.add(n);
        int[] arraysToReturn = new int[primeFactors.size()];
        for(int i=0; i<primeFactors.size(); i++){
            arraysToReturn[i] = primeFactors.get(i);
        }
        return arraysToReturn;
    }

    // magic array
    //{The sum of the prime numbers in the array must equal the first element of the array}
    //if there are no primes the first element must be zero
    //there is a function named isPrime the returns 1 if its passed int is prime
    public static int isMagicArray (int[] a){
        int sum = 0;
        if(a[0]== 0) return 1;
        for(int i=0; i<a.length-1; i++){
            boolean isPrime = true;
            for(int j=2; j<a[i];j++){
                if(a[i]%j ==0)
                    isPrime = false;
            }
            if(isPrime && a[i]> 0)
                sum+=a[i];
        }if(sum==a[0]) return 1;
        return 0;
    }
    public static int isComplete(int[] a){
        int min=0;
        int max=0;
        int countCondition =0;
        for(int i=0; i<a.length-1; i++){
            if(a[i]% 2==0){
                min = a[i];
                max = a[i];
                countCondition++;
                break;
            }
        }
       for(int j=0; j<a.length-1; j++){
           if(a[j]%2==0){
               if(min>a[j]) min =a[j];
               if(max<a[j]) max =a[j];
           }
       }if(min!=max) {
           countCondition++;
           int y = min +1;
           for(int k=0; k<a.length-1; k++){
                if(y==a[k] && y<max)
                    y++;
           }
           countCondition++;
        }
       if(countCondition ==3) return 1;
       return 0;
    }
    public static int isPrimeProduct(int n){
        for(int i=2;i<n;i++){
            int num1;
            int num2;
            if(n%i==0) {
                num1 = n/i;
                num2 = i;
                boolean isPrime = true;
                if(num1>1){
                    for(int j=2;j<n;j++){
                        if(num1%j==0) isPrime=false;
                        break;
                    }
                }
                if(isPrime) return 1;
            }

        }
        return 0;
    }

    public static void main(String[] args) {


        LinkedList list =  new LinkedList();

        list.insert(5);
        list.insert(7);
        list.insert(9);
        list.insert(19);

        list.show();
//        list.add(5);
//        list.add( 1,12);
//        list.add(2,67);
//        list.add(45);
//        Iterator iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        //Loops.Loops();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        double number1 = scanner.nextDouble();
//        scanner.nextLine();
//
//        System.out.print("Enter a number: ");
//        double number2 = scanner.nextDouble();
//        scanner.nextLine();
//
//        System.out.print("What operations do you want to perform?: ");
//        String operation = scanner.nextLine();
//
//        switch (operation){
//            case "sum":
//                System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
//                break;
//            case "sub":
//                System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
//                break;
//            case "div":
//                if(number2 == 0){
//                    System.out.printf("Can not divide number by zero!");
//                }else{
//                    System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
//                }
//                break;
//            case "mul":
//                 System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
//                break;
//            default:
//                System.out.printf("%s operation is not supported! ", operation);
//        }

           // Basics.Basic();

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
        //Test cases
       // int example1 = isMagicArray(new int[] {21, 3, 7, 9,11,4, 6} );
        //int example2 = isComplete(new int[] {5, 7, 9, 13});
//        int example2 = isSequencedArray2(new int[] {1,3,4,2,5},1 ,5);
//        int example3 = isSequencedArray2(new int[] {-5,-5,-4,-4,-3,-3,-2,-2,-2},-5,-2);
//        int example4 = isSequencedArray2(new int[] {0,1,2,3,4,5},1,5);
//        int example5 = isSequencedArray2(new int[] {1,2,3,4},1,5);
//        int example6 = isSequencedArray2(new int[] {1,2,5}, 1,5);
        //System.out.println("Example 1: " + example1);
        //System.out.println("Example 2: " + example2);
//        System.out.println("Example 3: " + example3);
//        System.out.println("Example 4: " + example4);
//        System.out.println("Example 5: " + example5);
//        System.out.println("Example 6: " + example6);
//        System.out.println(checkConcatenatedSum(198, 2));
//        System.out.println(checkConcatenatedSum(198, 3));
//        System.out.println(checkConcatenatedSum(2997, 3));
//        System.out.println(checkConcatenatedSum(2997, 2));
//        System.out.println(checkConcatenatedSum(13332, 4));
//        System.out.println(checkConcatenatedSum(9, 1));
    }
}
