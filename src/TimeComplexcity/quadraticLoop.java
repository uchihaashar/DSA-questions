package TimeComplexcity;

public class quadraticLoop {
    public static void main(String[] args) {
        int ans = QL(10);
        System.out.println(ans);
    }
    public static int QL(int n){
        for (int i = 0; i<n;i++){
            for (int j = 0; j<n;j++){
                System.out.print(i);
                System.out.println(j);
            }
        }
        return n;

    }
}
