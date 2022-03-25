package leetcode;

public class hamming_distance_461
 {
    public static int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;
        while (xor != 0){
            xor = xor & (xor-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }
}