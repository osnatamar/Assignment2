import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(containString("world hello", "world"));
    }


    public static boolean containString(String str1, String str2) {
        boolean contain = false;
         for (int i=0; i < str1.length()-str2.length(); i++) {
             if (str2.charAt(i)==str1.charAt(0)){
                     contain = true;
                 } for (int j = 0; j < str2.length(); j++, i++){
             if (str2.charAt(j) != str1.charAt(i)){
                 contain  =false;
             }

             }
         }
        return contain;
    }
    }

