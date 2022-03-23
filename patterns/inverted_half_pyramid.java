package patterns;

public class inverted_half_pyramid {
    public static void main(String[] args) {
        int n = 4;
        //outerloop
        for (int i = n; i >= 1; i--) {
            //innerloop
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();   
        }
    }
    
}


// ****
// ***
// **
// *