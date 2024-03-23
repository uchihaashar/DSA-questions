package ARRAYS;

import java.util.Scanner;

public class TwoSum {
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

          boolean ans =     twoSum(arr , 8);
        System.out.println(ans);


    }


    public static boolean twoSum(int[] arr, int k){
        int n = arr.length;
        for (int i =0; i<= n-2;i++){
            for (int j = i+1; j<=n-1;j++){
                if (arr[i]+arr[j]==k){
                    return true;
                }
            }
        }
        return false;
    }
}
