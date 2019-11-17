package com.sda.tasks.codingbat.array1;

public class SameFirstLast {

  public boolean sameFirstLastMethod(int[] nums) {
    if(nums.length>=1 && nums[0] == nums[nums.length-1]){
      return true;
    }
    return false;
  }

  public boolean sameFirstLastMethod2(int[] nums) {
    return nums.length >= 1 && nums[0] == nums[nums.length - 1];
  }

}
