package Java;

public class operators {
    public static void main(String[] args) {
        
        //post decrement 
        //assign value
        //change value

        int a = 10;
        int b = 0;
        b = a-- ;
        System.out.println(a);
        System.out.println(b);

        //pre decrement
        //change the value
        //assign value

        int c = 10;
        int d = 0;
        
        d = --c;
        System.out.println(c);
        System.out.println(d);

        //bitwise operators
        //&&
        // ||

        System.out.println("bitwise operatots");
        System.out.println("and operations" + (c & d));
        System.out.println(c | d);
        System.out.println( c ^ d);
        System.err.println(~c);

        }


    }
    

