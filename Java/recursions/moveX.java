public class moveX {
    public static void move(String str){
        String s = "x";
        String new_str = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x'){
                count++;
            }
            else{
                new_str += str.charAt(i);
            } 
        }
        System.out.println(count);
        System.out.println(new_str+s.repeat(count));

    }
    public static void main(String[] args) {
        String str = "abxcdxefx";
        move(str);   
    }
    
}
