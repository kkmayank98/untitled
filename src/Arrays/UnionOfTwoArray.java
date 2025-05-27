package Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] ={1,2,3,4,5,6};
        unionOfTwoSortedArray(arr1,arr2);
        
    }
    // Brute force using Set interface
    public static void unionOfTwoSortedArray(int[] arr1, int arr2[]){
        Set<Integer> s1 = new HashSet();

        for(int i =0; i<arr1.length; i++){
            s1.add(arr1[i]);
        }
        for(int i =0; i<arr2.length; i++){
            s1.add(arr2[i]);
        }

        for(int i : s1){
            System.out.print(i+" ");
        }

    }

}
