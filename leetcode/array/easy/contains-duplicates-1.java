/*
    Source
    https://leetcode.com/problems/contains-duplicate/

    Attempt 1
    DS: 1d array

    Steps
    // create an array double the length of nums
        // NOTE: the array to hold all of the numbers in nums and their count

        // loop through nums from 0 to the n-1 element
            // i + j represents the count for each ith number in the array
            // every time number a number is found in the array increment the i + jth element
            // if the i + jth element 2 times then break from the loop

    Attempt 2
    DS: hash map

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

*/

import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        int size = nums.length;

        for (int i = 0; i < size; i++){
            if (count.containsKey(nums[i])){
                int update_value = count.get(nums[i]) + 1;
                count.put(nums[i],update_value);
                if (count.get(nums[i]) >= 2){
                    return true;
                }
            }
            else{
                count.put(nums[i],1);
            }
        }
        return false;
    }
}
