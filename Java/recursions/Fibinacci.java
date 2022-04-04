// public class Fibinacci {
//     public static int fibinocci(int n){
//         if (n == 0){
//             return 0;
//         }
//         else if (n == 1 || n==2){
//             return 1;
//         }
//         else{
//             return fibinocci(n-1)+fibinocci(n-2);
//         }
       


//     }
//     public static void main(String[] args) {
//         System.out.println(fibinocci(9));
        
//     }
    
// }

// public class Fibinacci{
//     public static void fibinacci(int a, int b, int n){
//         if (n == 0){
//             return;
//         }
//         int c = a+b;
//         System.out.println(c);
//         fibinacci(b, c, n-1);
//     }
//     public static void main(String[] args) {
        
//         int a = 0;
//         int b = 1;
//         System.out.println(a);
//         System.out.println(b);
//         int n = 7;
//         fibinacci(a, b, n-2 );
//     }
    

// }

// public class Fibinacci{
//     public static void main(String[] args) {
//         int n = 9;
//         int first = 0;
//         int sec = 1;
//         int res = first+sec;
//         System.out.println(first);
//         System.out.println(sec);
//         for (int i = 2; i < n; i++) {
//             first = sec;
//             sec = res;
//             res = first+sec; 
//             System.out.println(res);
//         }       
//         // System.out.println(res);        
//     }

// }


public class Fibinacci{
    public static int calcPower(int x, int n){
        if (n == 0){
            return 1;
        }
        if (x == 0){
            return 0;
        }
        int res = calcPower(x, n-1);
        int resn = x * res;
        return resn;

    }
    public static void main(String[] args) {
        int out = calcPower(2, 5);
        System.out.println(out);
        
    }
}