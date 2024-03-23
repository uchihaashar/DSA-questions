package TimeComplexcity;

public class OofN {
    public static void main(String[] args) {
        int ans = linearLoop(10);
        System.out.println(ans);

    }
    public static int linearLoop(int n ){
        for (int i = 0 ; i < n ; i++){
            System.out.println(i);
        }
        return n ;
    }

}
