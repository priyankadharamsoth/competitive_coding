package leetcode;

public class powerofTwo {
    public static void powerof2(int n){
        //another way
        if (n <= 0){
            System.out.println("not valid number");
        }
        
        if ((n & (n-1)) == 0){
            System.out.println("power of two");
        }
        else{
            System.out.println("not power of 2");
        }
        
    }
    public static void main(String[] args) {
        int num  = 64;
        int count = 0;

        if (num <= 0){
            System.out.println("not a valis number");
        }
        
        for (int i = 0; i < 32; i++) {
            int mask6 = 1 << i;
            
            if ((mask6 & num) != 0){
                count += 1;
            }
        }
        if (count == 1){
        System.out.println("power of two");
        }
        else{
            System.out.println("not a power of two");
        }
        
        powerof2(num);
    }
    
}
        

    
    

