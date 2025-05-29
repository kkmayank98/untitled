package Arrays;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {

         int [] arr ={0,1,1,1,1,1,1,1,0,0,1,1,0,1,1,1,1};
         int answer = maxConsecutiveOnes(arr);
         System.out.println(answer);

        
    }
    /*
     * 
     * {0,1,1,1,0,0,1,1,0,1,1,1,1}
     */

    public static int maxConsecutiveOnes(int [] arr){
        int answer = 0;
        int count = 0;
        

        for(int i =0; i< arr.length; i++){

            if(arr[i]==1){
                count++;
                answer = Math.max(answer, count);

            }
            else count=0;
        }
        return answer;

    }
}
