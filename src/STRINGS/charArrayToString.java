package STRINGS;

public class charArrayToString {
    public static void main(String[] args) {
        char [] ch = {'A','S','H','A','R'};

        String ans = "";
        for (int i = 0 ; i<ch.length;i++){
            ans = ans+ch[i];

        }
        System.out.println(ans);
    }
}
