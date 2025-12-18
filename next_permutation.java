import java.util.Arrays;
public class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, n - 1);
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }
    public static void main(String[] args) {
        Solution np = new Solution();
        int[] nums = {1, 2, 3};
        np.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
        int[] nums2 = {3, 2, 1};
        np.nextPermutation(nums2);
        System.out.println(Arrays.toString(nums2)); 
        int[] nums3 = {1, 1, 5};
        np.nextPermutation(nums3);
        System.out.println(Arrays.toString(nums3));
    }
}
