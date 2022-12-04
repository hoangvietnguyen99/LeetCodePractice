/**
 * 
 */
package easy;

/**
 * @author hoang
 *
 */
public class BinarySearch {

  /**
   * @param args
   */
  public static void main(String[] args) {

  }

  public static int search(int[] nums, int target) {
    return search(nums, 0, nums.length - 1, target);
  }

  public static int search(int[] nums, int left, int right, int target) {
    if (right >= left) {
      int mid = left + (right - left) / 2;

      if (nums[mid] == target) {
        return mid;
      }

      if (nums[mid] > target) {
        return search(nums, left, mid - 1, target);
      }

      return search(nums, mid + 1, right, target);
    }

    return -1;
  }

  public static int search2(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] == target) {
        return mid;
      }
      if (nums[mid] > target) {
        right = mid - 1;
      }
      if (nums[mid] < target) {
        left = mid + 1;
      }
    }
    return -1;
  }
}
