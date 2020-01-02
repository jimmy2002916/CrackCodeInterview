package Chapter1;

public class Chapter_1_1 {

    public static void main(String[] args) {
        isUniqueChars("shhit");
    }

    static boolean isUniqueChars(String str){
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128]; //布林值預設為false
        for(int i = 0; i < str.length(); i++){
            int val = str.charAt(i);

            if(char_set[val] == true){ //沒有寫判斷式的話，自動判斷為true
                System.out.println(char_set[val]);
                System.out.println(str.charAt(i));
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

}
