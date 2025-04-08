/*
8)Given an array of integers, find all unique triplets in the array that sum to zero.
 */

package wt.mar29.pkg;

public class Question8 
{
	public static void findTriplets(int[] nums) {
        int n = nums.length;
        System.out.println("Unique triplets that sum to zero:");

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        System.out.println(nums[i] + ", " + nums[j] + ", " + nums[k]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        findTriplets(nums);
    }
}
