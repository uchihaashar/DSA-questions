package HASHMAP;

import java.util.HashSet;

public class distinctElements {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9,0};
      int din =  DE(arr);
        System.out.println(din);


    }
    public static int DE(int arr []){
        HashSet<Integer>hs = new HashSet<>();
        for (int i =0 ; i< arr.length;i++){
            hs.add(arr[i]);

        }

        return hs.size();
    }
}
