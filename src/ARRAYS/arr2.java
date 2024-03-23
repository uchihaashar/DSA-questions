package ARRAYS;

import java.util.Scanner;

public class arr2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the length of the array");
        int n = sc.nextInt();
        int sum = 0 ;

         int arr [ ] =  new int[ n];
        System.out.println(" enter the number in arr index ");

         for (int i = 0 ; i < arr.length ; i++){
             arr [ i ]= sc.nextInt();
             sum += arr[i];
         }

        System.out.println( "the sum of all array index is " + sum);
    }
}
