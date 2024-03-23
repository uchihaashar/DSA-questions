package ARRAYS;

import java.util.Scanner;

public class dsaprep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lengtth of array");
        int num = sc.nextInt();
        int arr [] = new  int[num];
        System.out.println(" Index bhar L**de");
       for (int i = 0 ; i < arr.length ; i++){
           arr[i]=sc.nextInt();
       }
    int re =   dhundbhai(arr);
        System.out.print(" finall answer =  ");
        System.out.println(re);

    }

    public static int dhundbhai(int arr[]){

        int max = 0;
        for ( int i = 0 ; i<arr.length;i++){
            if (arr[i]>max){
                max= arr[i];

            }

        }

        int count = 0;
        for ( int i = 0 ; i <arr.length; i++){
            if (arr[i] == max){
                count++;
            }
        }
        return arr.length - count ;

    }

}
