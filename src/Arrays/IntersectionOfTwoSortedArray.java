package Arrays;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArray {
    public static void main(String[] args) {
        int [] arr1 = {0,1,2,3,4};
        int [] arr2 = {2,3,4,9};
        List<Integer> result;

        result = intersection(arr1, arr2);
        int size = result.size();
        System.out.println("size = "+size);
        for(Integer i :result){
            System.out.print(i+" ");
        }

    }

    public static List<Integer> intersection(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int i = 0;
        int j = 0;
        List<Integer> intersect = new ArrayList<>();
    
        while (i < n && j < m) {
            // Skip duplicates in a
            while (i > 0 && i < n && a[i] == a[i - 1]) i++;
            // Skip duplicates in b
            while (j > 0 && j < m && b[j] == b[j - 1]) j++;
    
            if (i >= n || j >= m) break;
    
            if (a[i] == b[j]) {
                intersect.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
    
        return intersect;
    }
}
