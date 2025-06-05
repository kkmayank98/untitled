package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {2,6,11,15};
        int target = 9;
        int [] result = twoSumOptimized(arr, target);

        for(int i : result){
            System.out.print(i+" ");
        }
        
    }
    //optimal solution
    public static int [] twoSum(int [] nums, int target){
       int n = nums.length;       

        for(int i  =0; i< n; i++){

            for(int j =i+1; j< n; j++){
                if(nums[i] + nums[j] == target){
                  return new int[]{i,j};
                }
            }
        }

        
       return new int[]{-1,-1};

    }

    // Optimized using Hashmap in O(n)
    public static int[] twoSumOptimized(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // value -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[0]; 
    }
}

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 * 
 * 
 */