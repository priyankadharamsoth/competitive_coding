
public class Factorial {
    public static void factorial (int n, int fact){
        if (n == 0 ){
           System.out.println(fact);
           return;
        }
        fact *= n;
        factorial(n-1, fact);
        

    }
    public static void main(String[] args) {
        factorial(5, 1);
        
    }
    
}
