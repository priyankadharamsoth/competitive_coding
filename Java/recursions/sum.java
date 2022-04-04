


public class sum {
    public static void Sum(int n,int sum){
        if (n == 0){
            System.out.println(sum);
            return;
        }
        sum += n;
        Sum(n-1,sum);
    }
    public static void main(String[] args) {
        Sum(6,0);
        
    }
    
}

