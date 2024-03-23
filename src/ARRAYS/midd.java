package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class midd {
    public static void main(String[] args) {
        Scanner sce = new Scanner(System.in);
        int arr [] = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};

        int k = 8 ;
        reverse(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        reverse(arr, 0 , k-1);
        System.out.println(Arrays.toString(arr));
        reverse(arr, 8 ,arr.length-1);
       System.out.println(Arrays.toString(arr));



    }

    public static void reverse(int arr[] , int s, int e){

        int  sp = s;
        int ep = e;

        while (sp<ep){
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp ;
            sp++;
            ep--;

        }

    }
}
