package com.interviewprep.arrays.containerwithmostwater;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ContainerWithMostWaterTest {

  @ParameterizedTest
  @MethodSource("getAreaOfContainerWithMostWaterArguments")
  void getAreaOfContainerWithMostWater(int[] input, int expected) {
    assertEquals(expected, ContainerWithMostWater.getAreaOfContainerWithMostWater(input));
  }

  private static Stream<Arguments> getAreaOfContainerWithMostWaterArguments() {
    return Stream.of(
        of(null, 0),
        of(new int[] {}, 0),
        of(new int[] {500}, 0),
        of(new int[] {7, 1, 2, 3, 9}, 28),
        of(new int[] {4, 8, 1, 2, 3, 9}, 32));
  }
}
