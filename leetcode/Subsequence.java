package leetcode;
public class Subsequence {
    public static void main(String[] args) {
        String s = "gca";
        String t = "ahbgc";
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length() ) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            }
            else{   
                j++;
            }
        }
        if (i == s.length()) {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    
}
