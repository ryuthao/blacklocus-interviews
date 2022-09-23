package com.blacklocus;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class TwoSumTest {
    private TwoSum twoSum;

    @BeforeEach
    public void setup() {
        this.twoSum = new TwoSum();
    }

    @DisplayName("Test using various inputs")
    @ParameterizedTest
    @MethodSource
    public void testTwoSum(int[] input, int target, int[] expected) {
        int[] solution = this.twoSum.twoSum(input, target);

        assertThat(solution).containsExactly(expected);
    }

    private static Stream<Arguments> testTwoSum() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, 6, new int[]{1, 3}),
                Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1}),
                Arguments.of(new int[]{3, 3}, 7, new int[]{}),
                Arguments.of(new int[]{3, 1, 2, 5, 4, -8}, -5, new int[]{0, 5})
        );
    }
}
