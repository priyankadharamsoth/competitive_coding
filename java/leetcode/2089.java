import java.util.*;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> indeces = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                indeces.add(i);
            }
        }
        return indeces;
    }

    private void swap(int i, int j, char[] charArray) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }

    public void reverseString(char[] s) {
        for (int i = 0, j = s.length-1; i <= j; i++, j--) {
            swap(i, j, s);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.targetIndices(new int[] { 1, 7, 3, 4, 5 }, 7));
    }
    
}