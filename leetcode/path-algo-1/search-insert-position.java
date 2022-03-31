/*
    Attempt 1

    Source: https://leetcode.com/problems/search-insert-position/

    Possible input:
    - array of positive and negative integers
    - an array of 10e4 elements

    Possible output:
    - index of the target element
    - index where the target should be inserted

    Assumptions:
    - input array will have at least one element
    - when the left = right, then the search area (i.e. the number of elements in the search area) will be 1

    Soulution: search for the location of the target or where it should be
    - set up your pivot, left bound, and right bound to keep track of the search area
    - search until the left bound crosses the right right bound
    - calculate the pivot (midpoint) of the search area
    - if the number at the pivot index is your target
    --> the target has been found and the pivot index should be returned, exit loop
    - if the number at the pivot index is greater than your target
    --> shrink the search area to be all elements to the left of the pivot
    - if the number at the pivot index is less than the targer
    --> shrink the search area to be all elements to the right of the pivot
    - if the target has not been found, compare the number at the pivot index to the target
    --> if the number is greater, return the index to the left of the pivot
    --> if the number is less, return the index to the right of the pivot

    Analysis:
    Time complexity - O ()
    Space complexity - O ()
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        
    }
}
