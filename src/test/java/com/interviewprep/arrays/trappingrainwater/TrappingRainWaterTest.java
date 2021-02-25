package com.interviewprep.arrays.trappingrainwater;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TrappingRainWaterTest {

  @ParameterizedTest
  @MethodSource("calculateTrappedRainWaterArguments")
  void calculateTrappedRainWater(int[] input, int expected) {
    assertEquals(expected, TrappingRainWater.calculateTrappedRainWater(input));
  }

  private static Stream<Arguments> calculateTrappedRainWaterArguments() {
    return Stream.of(of(new int[] {0, 1, 0, 2, 1, 0, 3, 1, 0, 1, 2}, 8));
  }
}
