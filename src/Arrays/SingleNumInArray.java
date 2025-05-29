package Arrays;

import java.util.Arrays;

public class SingleNumInArray {

    public static void main(String[] args) {
        int []  nums = {4,1,2,1,2};
        int answer = singleNumberInTwiceArray(nums);
        System.out.println(answer);
    }

    public static int singleNumberInTwiceArray(int [] nums){
        int result = 0;
    for (int num : nums) {
        result ^= num; 
    }
    return result;
    }
}
