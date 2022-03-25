package Java;

import java.util.Scanner;

public class bitManupulation {
    public static void main(String[] args) {

        // get bit
        int a = 5;
        int pos = 2;
        int mask = 1 << pos;
        if ((mask & a ) == 0){
            System.out.println("the bit is zero");
        }
        else{
            System.out.println("thr bit is one");
        }

        //set bit
        int b = 5;
        int pos1 = 1;
        int mask1 = 1 << pos1;
        System.out.println((mask1 | b));

        //clear bit (we have to clear that bit at perticular pos)
        int n = 5;
        int pos2 = 2;
        int mask2 = 1 << pos2;
        int neg = ~(mask2);

        System.out.println(neg & n);

        //update
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        int number = 5;
        int position = 2;
        //set
        int mask3 = 1 << position;
        if (operation == 1){
            System.out.println(mask3 | number);
        }
        else if (operation == 0){
            int newMask = ~(mask3);
            System.out.println(newMask & number);
        }

        //count ones in number
        int num = 64;
        int count = 0;
        
        for (int i = 0; i < 32; i++) {
            int mask6 = 1 << i;
            int val = (mask6 & num);
            if (val != 0){
                count += 1;
            }
        }
        if (count == 1){
            System.out.println("power of 2"); 
        }
        else{
            System.out.println("not a power of 2");
        }
        
    }





}



    

