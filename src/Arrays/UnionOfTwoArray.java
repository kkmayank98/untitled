package Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionOfTwoArray {
    public static void main(String[] args) {
        List<Integer> result;
        int[] arr1 = {1,2,3,4,4,4,4,4,4,4,4,4,4};
        int[] arr2 ={1,2,3,4,5,6,7,8,9,10};
        long startTime1 = System.nanoTime();
        unionOfTwoSortedArray(arr1,arr2);

        result = unionofTwoSortedArrayOptimized(arr1,arr2);
        System.out.println();
        for (Integer i : result) {
            System.out.print(i+" ");
        }
    }
    // Brute force using Set interface
    public static void unionOfTwoSortedArray(int[] arr1, int[] arr2){
        Set<Integer> s1 = new HashSet<>();

        for (int k : arr1) {
            s1.add(k);
        }
        for (int j : arr2) {
            s1.add(j);
        }

        for(int i : s1){
            System.out.print(i+" ");
        }

    }

    //Optimal approach

    public static List<Integer> unionofTwoSortedArrayOptimized(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int i =0;
        int j=0;
        List<Integer> union = new ArrayList<>();

        while(i < n && j < m  ){

            //skip duplicates element in array
            while(i > 0 && i < n && arr1[i] == arr1[i-1]){ i++;}
            while(j > 0 && j < m && arr2[j] == arr2[j-1]){ j++;}

            if(i < n && j <m){
                if(arr1[i] < arr2[j]){
                    union.add(arr1[i]);
                    i++;
                } else if (arr1[i] > arr2[j]) {
                    union.add(arr2[j]);
                    j++;
                }
                else{
                    union.add(arr1[i]);
                    i++;
                    j++;
                }
            }

        }
        // Add remaining elements from a[]
        while (i < n) {
            if (i == 0 || arr1[i] != arr1[i - 1]) {
                union.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements from b[]
        while (j < m) {
            if (j == 0 || arr2[j] != arr2[j - 1]) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union;


    }

}
