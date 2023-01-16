import java.util.Arrays;

public class Test {

  public static void main(String[] args) {
    int[] nums = {-4,-1,0,3,10};
    System.out.println(Arrays.toString(new Test().sortedSquares(nums)));
  }

  public int[] sortedSquares(int[] nums) {
    int left = 0;
    int right = nums.length - 1;
    int[] result = new int[nums.length];
    int i = result.length - 1;

    while (left <= right) {
      if (left == right) {
        result[i] = nums[left] * nums[left];
        break;
      } else if (Math.abs(nums[left]) > Math.abs(nums[right])) {
        result[i] = nums[left] * nums[left];
        left++;
      } else {
        result[i] = nums[right] * nums[right];
        right--;
      }
      i--;
    }
    return result;
  }

}
