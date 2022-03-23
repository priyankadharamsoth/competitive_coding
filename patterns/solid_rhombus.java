package patterns;



public class solid_rhombus {
    
    //1st spaces
    public static void main(String[] args) {
        int m = 5;
        //outer loop for rows
        for (int i = 1; i <= m; i++) {
            //for spaces
            for (int j = 0; j <= (m-i) ; j++) {
                System.out.print(" ");
            }
            //for numbers
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }



    
}
