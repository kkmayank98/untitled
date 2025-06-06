package Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3,3,4,4,4,4};

        int result = removeDuplicates(arr);
        System.out.println(result);
    }


    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}
