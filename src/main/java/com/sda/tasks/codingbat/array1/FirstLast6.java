package com.sda.tasks.codingbat.array1;

public class FirstLast6 {

  public boolean firstLast6Method(int[] nums) {
    if(nums[0] == 6 || nums[nums.length-1] == 6){
      return true;
    }
    return false;
  }

  public boolean firstLast6Method2(int[] nums) {
    return nums[0] == 6 || nums[nums.length-1] == 6;
  }
}
