public class reverse {
    public static void printInt(String str, int idx){
        if (idx < 0){
            return;
        }
        System.out.print(str.charAt(idx)+ " ");
        printInt(str, idx-1);
    }
    public static void main(String[] args) {
        String str = "priyanka";
        int idx = str.length()-1;
        printInt(str, idx);

        
    }
    
}
