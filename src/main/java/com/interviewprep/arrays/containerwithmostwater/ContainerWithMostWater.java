package com.interviewprep.arrays.containerwithmostwater;

import static java.util.Objects.isNull;

public class ContainerWithMostWater {

  private ContainerWithMostWater() {}

  public static int getAreaOfContainerWithMostWater(int[] input) {
    if (isNull(input) || (input.length <= 1)) {
      return 0;
    }

    int p1 = 0;
    int p2 = input.length - 1;
    int area = 0;

    while (p1 < p2) {
      final int height = Integer.min(input[p1], input[p2]);
      final int width = p2 - p1;
      final int thisArea = height * width;

      area = Integer.max(area, thisArea);

      if (input[p1] <= input[p2]) {
        p1++;
      } else {
        p2--;
      }
    }

    return area;
  }
}
