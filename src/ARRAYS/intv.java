package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class intv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array ");
        int lengh= sc.nextInt();
        int arr []=new int[lengh];
        for (int i =0 ; i<=arr.length-1;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("original array look like");
        for (int i = 0 ; i <=arr.length-1; i++){
            System.out.print(arr[i]+" ");

        }
        int k = sc.nextInt();
        reverse(arr , 0  , arr.length-1);



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
