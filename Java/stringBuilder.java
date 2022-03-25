package Java;

public class stringBuilder {
    public static void reverse(StringBuilder str){
        
        int n = str.length();
        int mid = n/2;
        // for (int i = 0; i < mid; i++) {
        //     int start = i;
        //     int back = n-1-i;

        //     char frontChar = str.charAt(start);
        //     char backChar = str.charAt(back);

        //     str.setCharAt(start, backChar);
        //     str.setCharAt(back, frontChar);
        // }
        // System.out.println(str);
    }
    public static void palindrome(StringBuilder str){
        int n = str.length();
        int mid = n/2;
        boolean flag = true;
        for (int i = 0; i < mid; i++) {
            if (str.charAt(i) != str.charAt(n-1-i)) {
                flag = false;
                break; 
            }
        }
        if (flag){
            System.out.println("polindrome");
        }
        else{
            System.out.println("not polindrome");
        }
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("priyanka");

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0,'s');
        System.out.println(sb);

        //insert at
        sb.insert(0, 'p');
        System.out.println(sb);

        //delete 
        sb.delete(1, 2);
        System.out.println(sb);

        //append
        sb.append("ammu");
        System.out.println(sb.length());

        //reverse string
        
        reverse(sb);

        //checking palindrome 
        StringBuilder name = new StringBuilder("racer");
        StringBuilder name1 = new StringBuilder("level");
        palindrome(name);
        palindrome(name1);
        
    }
}