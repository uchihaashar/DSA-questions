package ARRAYS;

import java.util.Scanner;

public class arr1 {
    public static void main(String[] args) {
        Scanner scl = new Scanner(System.in);
        int n = scl.nextInt();
        int [] arr = new int[n];

        for (int i = 0 ; i < arr.length; i++){
                arr [ i ] = scl.nextInt();

        }

        for ( int i = 0 ; i <arr.length; i ++){
            System.out.print( arr[i] + " ");
        }

        for (int i = 0 ; i <arr.length/2;i++){
            int tem = arr[i];
            arr[i]=arr[arr.length - 1];
            arr[arr.length-1 ]=tem;

        }

        for (int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]+ " ");
        }

        }

}
