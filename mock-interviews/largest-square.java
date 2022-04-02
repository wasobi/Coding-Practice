/*
    Attempt 1

    Mock Interview from interview.io

    Problem:
    Given an array <rectangles> that contains the length and
    width of n rectangles such that rectangle[n] = [length,width].
    Find the largest square that can be made and return the number of times
    the square of length = maxLen and width = maxWidth can be created.

    Possible input:
    - 2d array of integers
    - empty array
    - array of an infinite number of elements

    Possible output:
    - integer representing the number of times a square was created with the dimensions
    of maxLen by maxWidth

    Assumptions:
    - the dimensions of each rectangle will always be a pair of positive integers

    Soulution:
    - TODO

    Analysis:
    Time complexity - O ()
    Space complexity - O ()
*/

class Solution {
    public int searchInsert(int** rectangles) {
        int count = 0;
        int maxLen;
        for (int i = 0; i < rectangles.length - 1; i++) {
            int tempLen = 0;
            if (rectangles[i][0] > rectangles[i][1]) {
                tempLen = rectangles[i][0];
            }
            else {
                tempLen = rectangles[i][1];
            }
            if (tempLen > maxLen) {
                maxLen = tempLen;
                count = 1; // new maxLen found, reset the counter
            }
            else if (tempLen == maxLen){
                count++;
            }
            else {
                continue;
            }
        }
        return count;
    }

}
