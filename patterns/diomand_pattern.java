package patterns;

public class diomand_pattern {
    public static void main(String[] args) {
        int m = 4;
        for (int i = 1; i <= m; i++) {
            //spaces
            for (int j = 1; j <= m-i; j++) {
                System.out.print(" ");
            }
            //starts
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();  
        }
        for (int i = m-1; i >= 1; i--) {
            //spaces
            for (int j = 1; j <= m-i; j++) {
                System.out.print(" ");
            }
            //starts
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();  
        }
        
        

    }
    
}
