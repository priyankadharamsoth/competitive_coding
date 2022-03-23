package patterns;

public class half_pyramid_numbers {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println(); 
        }
        // 1
        // 12
        // 123
        // 1234

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println(); 
        }
        //1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1


        int k = 1;
        for (int i = 1; i <= n; i++)  {
            for (int j = 1; j <= i; j++) {
                System.out.print(k+" ");
                k++;
            }
            System.out.println(); 
        }

        
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15

        for (int i = 1; i <= n; i++)  {
            for (int j = 1; j <= i; j++) {
                int sum = i+j;
                if (sum % 2 == 0){
                    System.out.print("1"+" ");
                }    
                else{
                    System.out.print("0"+ " ");
                }
            }
            System.out.println(); 
        }
        // 1 
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1
    }
}


