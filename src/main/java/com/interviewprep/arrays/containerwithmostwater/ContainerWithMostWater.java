package com.interviewprep.arrays.containerwithmostwater;

import static java.util.Objects.isNull;

public class ContainerWithMostWater {

  private ContainerWithMostWater() {}

  public static int getAreaOfContainerWithMostWater(int[] input) {
    if (isNull(input) || (input.length <= 1)) {
      return 0;
    }

    int area = 0;

    for (int i = 0; i < input.length - 1; i++) {
      for (int j = i + 1; j < input.length; j++) {
        area = Integer.max(area, Integer.min(input[i], input[j]) * (j - i));
      }
    }

    return area;
  }
}
