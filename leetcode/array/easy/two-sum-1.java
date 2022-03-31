/*

    Attempt 1

    Source: https://leetcode.com/problems/two-sum/

    Possible input
    - empty array
    - negative numbers

*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        // initialize the indices array
        int [] indices = {-1,-1};
            for (int i = 0; i <= size - 2; i++) {
                for (int j = i + 1; j <= size - 1; j++) {
                    int sum = nums[i] + nums[j];
                    if (sum == target) {
                        indices[0] = i;
                        indices[1] = j;
                        break;
                    }
                }
            }
        return indices;
    } // end
}
