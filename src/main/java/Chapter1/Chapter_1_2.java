package Chapter1;
import java.util.Arrays;

import static java.util.Arrays.*;

public class Chapter_1_2 {
    public static void main(String[] args) {
        String s1 = sorting("shit");
        String s2 = sorting("shit");
        permutation(s1, s2);
//        char[] c1 = sorting(s1);
//        char[] c2 = sorting(s2);
//        System.out.println(c1.toString());//這樣出來的字串會不一樣
//        System.out.println("======");
//        System.out.println(c2.toString());//這樣出來的字串會不一樣

//        permutation(c1, c2);

    }

    static boolean permutation(String s1, String s2){
        if (s1.equals(s2)){
            System.out.println("s1 same as s2");
            return true;
        }
        System.out.println("they are not same");
        return false;
    }

    static String sorting(String str){
        char[] content = str.toCharArray();
        sort(content); //要轉乘chart才能sort
        return new String(content);
    }
}
