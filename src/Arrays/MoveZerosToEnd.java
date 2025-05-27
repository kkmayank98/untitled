package Arrays;

public class MoveZerosToEnd {

    public static void main(String[] args) {
        int [] arr = {1,0,2,0,3,0,4,0};
        moveZerosToEnd(arr);
        for(int i :arr){
            System.out.print(i+" ");
        }
    }
    public static void moveZerosToEnd(int[] arr) {
        int insertPos = 0;

        for(int i =0 ;i < arr.length; i++){
            if(arr[i] != 0){
                arr[insertPos++] = arr[i];
            }
        }
        while(insertPos<arr.length){
            arr[insertPos++] =0;
        }

    }
}

