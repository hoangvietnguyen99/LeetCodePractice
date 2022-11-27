package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class TwoSum {

  @Test
  void testTwoSum() {
    int[] input = new int[] { 2, 7, 11, 15 };
    int target = 9;

    assertEquals(2, twoSum(input, target).length, "The output array has two elements.");
  }

  public int[] twoSum(int[] nums, int target) {

    Map<Integer, Integer> values = new HashMap<>();

    for (int index = 0; index < nums.length; index++) {
      int num = nums[index];

      Integer indexOfExpectedNum = values.get(target - num);

      if (indexOfExpectedNum != null) {
        return new int[] { index, indexOfExpectedNum };
      }

      values.put(num, index);
    }

    return new int[] {};
  }

}
