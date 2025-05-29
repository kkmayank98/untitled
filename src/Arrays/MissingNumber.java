package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,8};
        int result = missingNumberInArray(arr);
        System.out.println(result);
        
    }
    //Optimal Solution
    public static int missingNumberInArray(int [] arr){
        
        int n = arr.length;
        int m = n+1;
        int sum = 0;
        for(int i =0; i< n;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum+" array sum");

        int actualSum = (m*(m+1))/2;
        int missingNum  = actualSum -sum;

        return missingNum;
    }

}
