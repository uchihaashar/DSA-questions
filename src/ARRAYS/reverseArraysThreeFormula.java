package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArraysThreeFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println(" Enter the elemts in array");

        for (int i = 0 ; i < arr.length; i++){
            arr[i] =sc.nextInt();
        }
        System.out.print("Your origial array look like = ");
        for (int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" now enter the k value how many times you want to reverse the array");
        int k = sc.nextInt();
        reverse(arr,0 , n-1);
        reverse(arr ,0 ,k-1);
        reverse(arr ,6 ,n-1);
        System.out.print(" now K time reverse krne ke bd aisa lagta hai = ");
        System.out.println("Array: "+ Arrays.toString(arr));


    }


    public static void reverse(int arr[], int s,int e ){
        int sp = s;
        int ep = e;
        while (sp<ep){
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;

        }
    }
}
