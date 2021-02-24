package com.interviewprep.arrays.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  private TwoSum() {}

  public static int[] twoSum(int[] nums, int target) {
    final Map<Integer, Integer> hash = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      final int number = nums[i];

      if (hash.containsKey(number)) {
        return new int[] {hash.get(number), i};
      } else {
        hash.put(target - number, i);
      }
    }

    return null;
  }
}
