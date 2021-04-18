/*
    Source
    https://leetcode.com/problems/contains-duplicate/

    Attempt 1---
    DS: create a 1d array

    Steps
    // create an array double the length of nums
        // NOTE: the array to hold all of the numbers in nums and their count

        // loop through nums from 0 to the n-1 element
            // i + j represents the count for each ith number in the array
            // every time number a number is found in the array increment the i + jth element
            // if the i + jth element 2 times then break from the loop
    Complexity
        Time: O(n)
        Space: O(n)

    Attempt 2---
    DS: hash map

    Source
    https://leetcode.com/problems/contains-duplicate/submissions/

    Steps:
    // create a hash map
        // loop through nums from 0 to the n-1 element
            // if the element exists in the hash map
                // then increment the counter
                // if the number of occurences is < 1
                    // return true
            // otherwise add the number
        // return false

    Complexity:
        Time - O(n)
        Space - O(n)

    Attempt 3---
    DS: orginal 1d array

    Steps:
    // for n elements in nums, loop through nums from 0 to the n-1 element
        // for n elements in nums, loop through nums from i to the n-1 element
        // compare


    Attempt 4---
    DS: oringal 1d array

    Steps:
    // sort the array
    // for n elements in nums, loop through nums from 0 to the n-1 element
        // if nums[i] = num [i+1] then the numbers are not unique
    // return false;

    Complexity:
        Time - O(nlogn)
        Space - O(1)

*/

import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] == nums[i+1]){
             return true;
            }
        }
        return false;
    }
}
