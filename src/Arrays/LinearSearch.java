package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {1,3,5,-20,5,0,155,14};
        int k = 14;
        int result = linearSearch(arr, k);
        if(result == -1){
            System.out.println("Integer not found in array");
        }
        else{
            System.out.println("integer found at index: " +result);
        }
        
    }

    public static int linearSearch(int [] arr, int k){
        int n = arr.length;
        for(int i = 0; i< n; i++){
            if(arr[i] == k){
                return i;
            }
            
        }
        return -1;
    }

}
