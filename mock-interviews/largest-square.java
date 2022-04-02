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
    - iterate through the array of rectangles and find the maximum square that can be made from each rectangles
    --> determine if the length or the width is larger
    ----> if the length is longer than the width, then the width is largest value for length and width of a square that can be made for the ith rectangle
    ----> otherwise, the length is the largest value for length and width of a square that can be made for the ith rectangle
    --> if the length of the square is larger than the maxLen, then reset the maxLen and the counter
    --> if the length of the square is equal to the maxLen, increment the counter
    - return the number of squares of size maxLen can be created

    Analysis:
    Time complexity - O (n) because the solution uses a for loop and has to iterate over n elements
    Space complexity - O (1) because only variables were created in memory and they can be accessed in constant time
*/

class Solution {
    public int getMaxLength(int** rectangles) {
        int count = 0;
        int maxLen;
        for (int i = 0; i < rectangles.length - 1; i++) {
            int tempLen = 0;
            if (rectangles[i][0] < rectangles[i][1]) {
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
