package Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k =2;

        rightRotateArrayOptimal(arr, 2);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
   

    //Roating Array left by K times using Brute force approach
    public static void leftRotateByK(int [] arr, int k ){
        int size = arr.length;

        while(k> 0){
            int temp = arr[0];

      
        for(int i = 0; i< size-1;i++){
            arr[i] = arr[i+1];
          }
          arr[size-1] = temp;
            k--;  
        

    }
        }

        public static void reverse(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
          // Rotate array to the left by k positions in optimal
    public static void leftRotateByKOptimal(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // To handle k > n

        // Step 1: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 2: Reverse remaining elements
        reverse(arr, k, n - 1);

        // Step 3: Reverse the whole array
        reverse(arr, 0, n - 1);
    }

    public static void rightRotateArrayOptimal(int arr[], int k) {
        int n = arr.length;
        k = k % n; // Handles k > n
    
        // Step 1: Reverse the first part
        reverse(arr, 0, n - k - 1);
    
        // Step 2: Reverse the last k elements
        reverse(arr, n - k, n - 1);
    
        // Step 3: Reverse the whole array
        reverse(arr, 0, n - 1);
    }
    

}
