/*
    Attempt 1

    Source: https://leetcode.com/problems/first-bad-version/

    Possible input
    - n number of versions

    Possible output
    - the number of the first bad version (given through API)

    Soulution
    implement a binary search to find the first call
*/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int pivot = n/2;
        int startIndex = 0;
        int endIndex = 0;
        bool badVersion = false;

        for (int i = 0; i < n; i++) {
            badVersion = isBadVersion(pivot);
            if (badVersion == false) {
                // search for values of n > pivot
                // reset the left
            }
            else if (badVersion == true) {
                // search for values of n < pivot
                // reset the right
            }
            // calculate the new pivot by finding the middle call i.e.
            pivot = left + (right - left);
        }
    }
}
