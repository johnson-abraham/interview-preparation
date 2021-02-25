package com.interviewprep.arrays.trappingrainwater;

import java.util.Objects;

public class TrappingRainWater {

  private TrappingRainWater() {}

  /**
   * This is a brute-force solution
   *
   * @param input
   * @return
   */
  public static int calculateTrappedRainWater(int[] input) {
    if (Objects.isNull(input) || input.length <= 1) {
      return 0;
    }

    int trappedRainWater = 0;

    for (int i = 0; i < input.length; i++) {
      int leftMax = input[0];
      int rightMax = input[input.length - 1];

      int j = i;
      int k = i;

      while (j > 0) {
        leftMax = Integer.max(input[--j], leftMax);
      }

      while (k < input.length - 1) {
        rightMax = Integer.max(input[++k], rightMax);
      }

      final int total = Integer.min(leftMax, rightMax) - input[i];
      trappedRainWater += Integer.max(total, 0);
    }

    return trappedRainWater;
  }
}
