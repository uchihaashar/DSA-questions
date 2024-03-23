package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class forRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array length");
        int num = sc.nextInt();
        int arr[] = new int[num];
        int start = 0;
        int end = arr.length - 1;

        System.out.println(" enter the value in array index ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the original array look like");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" reverse array look like");
    /*    while (start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]= temp;
            start++;
            end--;
        }*/
        for (int i = 0 ; i < arr.length;i++){
            if (start<end){
                int temp = arr[start];
                arr[start]=arr[end];
                arr[end]= temp;
                start++;
                end--;
            }
        }
  System.out.println(Arrays.toString(arr));
    }
}