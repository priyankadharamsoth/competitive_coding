class Solution {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(0, nums.length-1, nums);
        reverse(0, k-1, nums);
        reverse(k, nums.length-1, nums);
        
    }
    
    private static void reverse(int l, int r, int[] nums) {
        while(l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        int x[] = {1,3,4,2};
        Solution.rotate(x, 10);
        
        
    }
}