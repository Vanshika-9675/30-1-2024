/**
 * Problem1
 */
import java.util.*;
public class Problem1 {
      public static void main(String[] args) {
          int nums[] = {2,4,3,5,6,8,8,7,9};
          int k = 13;
          Arrays.sort(nums);
          int n= nums.length;
          for(int i=0;i<n;i++){
               int start = i+1;
               int end = n-1;
               int target =  k - nums[i];
               while(start<end){
                if(nums[start]+nums[end]==target){
                   System.out.println(nums[i]+" "+nums[start]+" "+nums[end]);
                   start++;
                   end--;
                   while(start<end && nums[start]==nums[start-1]) start++;
                   while(start<end && nums[end]==nums[end+1]) end--;
                }
                else if(nums[start]+nums[end]>target){
                    end--;
                }
                else if(nums[start]+nums[end]<target){
                   start++;
                }
                while(i+1<n && nums[i]==nums[i+1]){
                    i++;
                }
          }
}
      }
    }
