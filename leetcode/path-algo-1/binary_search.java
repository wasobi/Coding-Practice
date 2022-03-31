/*
    Attempt 1

    Source: https://leetcode.com/problems/binary-search/

    Possible input
    - array of integers sorted in ascending order
    - all unique numbers

    Possible output
    - if the number exists, return the index
    - if the number does not exist, return -1

    ex.
    [0,2,4,5,6,7,8,9]
     - - - -|p - - -
     - - - - - - |p -
*/

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int pivot = (right - left)/2; // index of the middle most element in the subarray

        while (left <= right) {
            if (nums[pivot] == target) {
                return pivot;
            }
            // if the pivot is greater than the target, search  the left subarray
            if (nums[pivot] > target) {
                right = pivot - 1;
            }
            // if the pivot is smaller than the target, search  the right subarray
            else if (nums[pivot] < target) {
                left = pivot + 1;
            }
            pivot = left + (right - left)/2;
        }
        return -1;
    }
}
