package ARRAYS;

import java.util.Scanner;

public class arrrvv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.println("enter the value in index");
        for (int i = 0 ; i <arr.length; i++){
            arr[i]=sc.nextInt();

        }
        for ( int i = 0 ; i <arr.length ; i ++) {
            System.out.print(arr[i] + " ");
        }


    }
}
