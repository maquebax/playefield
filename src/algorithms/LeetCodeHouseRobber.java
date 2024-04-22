package algorithms;

public class LeetCodeHouseRobber {
    /**
     * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
     * <p>
     * Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,2,3,1]
     * Output: 4
     * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
     * Total amount you can rob = 1 + 3 = 4.
     * Example 2:
     * <p>
     * Input: nums = [2,7,9,3,1]
     * Output: 12
     * Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
     * Total amount you can rob = 2 + 9 + 1 = 12.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 100
     * 0 <= nums[i] <= 400
     */


    public static void main(String args[]) {
        int[] nums = {9, 10, 2, 3, 4, 5, 6};

        System.out.println(rob(nums));
    }


    public static int rob(int[] nums) {

        int n = nums.length;

        if (n == 0) return 0;
        if (n == 1) return nums[0];

        int maxsum[] = new int[n];

        maxsum[0] = nums[0];
        maxsum[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++)
            maxsum[i] = Math.max(nums[i] + maxsum[i - 2], maxsum[i - 1]);

        return maxsum[n - 1];
    }
}
