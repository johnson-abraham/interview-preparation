package com.interviewprep.arrays.twosum;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.of;

import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TwoSumTest {

  @ParameterizedTest
  @MethodSource("twoSumSuccessTestArguments")
  void twoSumSuccessTest(int[] input, int target, int[] expected) {
    assertTrue(Arrays.equals(TwoSum.twoSum(input, target), expected));
  }

  @ParameterizedTest
  @MethodSource("twoSumFailureTestArguments")
  void twoSumFailureTest(int[] input, int target) {
    assertNull(TwoSum.twoSum(input, target));
  }

  private static Stream<Arguments> twoSumSuccessTestArguments() {
    return Stream.of(of(new int[] {1, 3, 7, 9, 2}, 11, new int[] {3, 4}));
  }

  private static Stream<Arguments> twoSumFailureTestArguments() {
    return Stream.of(of(new int[] {1, 3, 7, 9, 2}, 50), of(new int[] {}, 1));
  }
}
