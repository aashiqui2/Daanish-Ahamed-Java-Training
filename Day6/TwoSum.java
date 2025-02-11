// package Day6;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int nums[]={2,7,11,15};
        int target=13;
        int result[] = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    break;
                }
            }
            break;
        }

        System.out.println(Arrays.toString(result));



    }
}
