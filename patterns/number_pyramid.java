package patterns;


public class number_pyramid {
    public static void main(String[] args) {
        int m = 5;
        for (int i = 1; i <= m; i++) {
            //spaces
            for (int j = 1; j <= m-i; j++) {
                System.out.print(" ");
            }
            //numbers
            for (int j = 1; j <= i; j++) {
                if (i == 1 || j == 1 || i == m || j == m){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();   
        }
    }
    
}
