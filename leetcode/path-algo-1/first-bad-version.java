/*
    Attempt 1

    Source: https://leetcode.com/problems/first-bad-version/

    Possible input:
    - n number of versions

    Possible output:
    - the number of the first bad version (given through API)

    Assumptions:
    - the output will always be a positive integer
    - there will always be value of n that is an answer

    Soulution: Implement a binary search to find the first bad version
    search for the first bad version while your left bound is less than your right bound
    - calculate the new pivot by finding the midpoint i.e. n/2
    - if it is not a bad version then
    --> reposition the left bound to be to the right of the pivot to check the versions of n > pivot
    - if it is a bad version then
    --> reposition the right bound to be to the left of the pivot to check the versions of n < pivot
    - when the left bound crosses the right bound, you have checked every version and will exit the loop
    - left will represent the bad version with the lowest value of n

    Analysis:
    Time complexity - O(log n) because the search was done on n sorted. In the worst case, we have to check log n elements to find the answer. 
    Space complexity - O (1) because no data structures were used to store data so it takes constant time to acces an element.
*/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int pivot;
        int left = 1;
        int right = n;
        boolean badVersion = false;
        while (left <= right) {
            pivot = left + (right - left)/2;
            badVersion = isBadVersion(pivot);
            if (!badVersion) {
                left = pivot + 1;
            }
            else if (badVersion) {
                right = pivot - 1;
            }
        }
        return left;
    }
}
