
public class printNum {
    public static void printnum(int n){

        if (n <= 5){//base condition
            System.out.println(n);
        printnum(n+1);//recursion
        }  
    }
    public static void main(String[] args) {
        printnum(1);
        
    }
    
}
