package leetcode;
import java.util.HashMap;
//import java.util.HashSet;
import java.util.Map;
//import java.util.Set;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        //Set<String> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            int ele2 = target - nums[i];
            if(map.containsKey(ele2)){
                return new int[] {map.get(ele2), i};
            }
            else{
                map.put(ele2, i);
            }
        }
        return new int[2];
    }
    
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = new int[] {1,2,3,4};
        obj.twoSum(arr, 9);
        
    }
}

