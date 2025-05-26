package Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {6,6,5,4,559,3,560,2,1};
        int largest = largestElement(arr);
        int secondLargest = secondLargest(arr);

        System.out.println("largest :"+largest+" secondLargest :"+secondLargest);
    }
    public static int largestElement(int arr[]){
        int largest = arr[0];
      //  int temp;
        for(int i = 0; i < arr.length; i++){

            if(arr[i] >= largest){
                largest = arr[i];

                
                
            }
        }
        return largest;
    }

    public static int secondLargest(int arr[]){
        int largest= arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];

            }
            else if(arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }
           
        }

        return secondLargest;
    }

}
