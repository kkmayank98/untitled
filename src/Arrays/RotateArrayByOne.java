package Arrays;

public class RotateArrayByOne {

    public static void rotateLeftByOne(int[] arr) {

        int size = arr.length;
        int temp = arr[0];
        for (int i = 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        arr[size - 1] = temp;
    }

    public static void rotateRightByOne(int[] arr) {
        int size = arr.length;
        int temp = arr[size-1];

        for(int i =size-1; i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        //rotateLeftByOne(arr);
        rotateRightByOne(arr);
        for(int i :arr){
            System.out.print(i+" ");
        }
    }
}
