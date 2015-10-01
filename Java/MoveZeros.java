/*
William Thing

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
*/

import java.util.Arrays;

public class MoveZeros {

   public static void main(String args[]) {
      int[] nums = {0, 1, 0, 3, 12};
      /*
      moveZeroes(nums);
      System.out.println(Arrays.toString(nums));
      */
      moveZeroesFaster(nums);
      System.out.println(Arrays.toString(nums));
      
   }
   
   public static void moveZeroesFaster(int[] nums) {
      int index = 0;
      for (int i = 0; i < nums.length; i++) {
         if (nums[i] != 0) {
            nums[index] = nums[i];
            index++;
         }
      }
      for (int j = index; j < nums.length; j++) {
         nums[j] = 0;
      }
   }
   
   public static void moveZeroes(int[] nums) {
        int len = nums.length;
        int index = 0;
        while (nums.length != 0 && index < len) {
            if (nums[index] == 0) {
                moveZeroesHelper(index, len, nums);
                len--;
            } else {
                index++;
            }
        
        }
    }
    
    public static void moveZeroesHelper(int index, int len, int[] nums) {
      for (int i = index; i < len-1; i++) {
         nums[i] = nums[i+1];
      }
      nums[len-1] = 0;
    }

}