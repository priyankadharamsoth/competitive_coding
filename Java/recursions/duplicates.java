

public class duplicates {
    public static boolean arr[]  = new boolean[26];
    public static int a = (int)'a';

    public static void dup(String str){
        String new_string = "";
        for (int i = 0; i < str.length(); i++) {
            int asci = (int)str.charAt(i);
            int idx = asci-a;
            if (arr[idx] == false){
                new_string += str.charAt(i);
                arr[idx] = true;
            }

        }
        System.out.println(new_string);
    }

    public static void main(String[] args) {
        String str = "abcdabcd";
        dup(str);
      
    }
    
}
