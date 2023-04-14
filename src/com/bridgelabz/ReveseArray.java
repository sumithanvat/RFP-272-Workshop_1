package com.bridgelabz;

import java.util.Scanner;
public class ReveseArray {
    public static void main(String[] args) { // main method started
     // taking user input by using scanner packege
        Scanner userinput = new Scanner(System.in);
        //  created scanner object name userinput
        System.out.println("enter elements of an array");
        int n = userinput.nextInt();
        int[] arr = new int[n];

        /*
         using for loop iterate from 0 to n-1
         */

        for (int i = 0; i < n; i++){
            arr[i]=userinput.nextInt();// read i th element of array enrerd by user
    }
        // initialize a variable start to 0
        int start = 0;
        // initialize variable end to the last index of the array
        int end = arr.length - 1;

        /*
        using while loop start index is less than end index
        */

        while (start < end) {
        // initilize temprary varible name as temp to the value at start index of array
            int temp = arr[start];
        // set value start is equal to end
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("the reversed array is ");
    /*
    using for loop for print all the elements
     */
        for (int i=0;i< arr.length;i++){
        // printing reversed element of array and giving space for clearity
        System.out.println(arr[i]+"  ");
    }
    }
}
