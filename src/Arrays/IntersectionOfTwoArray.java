package Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArray {

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,4,4,4};
        int arr2[] ={1,2,3,4,4,4,4,5,6};

        List<Integer> list = intersectionOfTwoSortedArrayOptimized(arr1, arr2);

        for(Integer i : list){
            System.out.print(i+" ");
        }

    }
    // Brute Force solution in N*M 
    public static List<Integer> intersectionOfTwoArray(int [] arr1, int [] arr2){
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int n = arr1.length;
        int m = arr2.length;
       
        
       for(int i = 0; i<n; i++ ){

        for(int j = 0; j < m; j++){
            if(arr1[i]==arr2[j] && !set.contains(arr2[j]) ){
                list.add(arr2[j]);
                set.add(arr2[j]);
            }
        }
       }

        return list;
    }
    
    public static List<Integer> intersectionOfTwoSortedArrayOptimized(int [] arr1, int [] arr2){
        List<Integer> list = new ArrayList<>();
        int i = 0; 
        int j =0;
        int n = arr1.length;
        int m = arr2.length;

        while(i < n && j < m ){

            if(arr1[i] == arr2[j]){
               if(list.isEmpty() || list.get(list.size() -1) != arr1[i]){
                 list.add(arr1[i]);
               }
                i++;
                j++;
            }
            else if(arr1[i] > arr2[j]){
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
        }
        return list;

    }
}
