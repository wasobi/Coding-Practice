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
    - array of n = queries.length elements
    - each index in the output array should represent how many points from the points array were located withing the circle

    Assumptions:
    - integers that represent coordinates on a plane can be positive or negative
    - number of points has no correlation with the number of circles

    Soulution:
    - TODO

    Analysis:
    Time complexity - O (n^2) because we are iterating over the elements j times for n elements in the queries array
    Space complexity - O (n) because there was an array created to store the total number of points in each circle
*/

/*
*   DISTANCE EQUATION: sqrt((x1 - x2)^2 + (y1 - y2)^2)
*/

class Solution {
    public int[] getPointsInCircles (int** points, int*** queries) {

        int[] validPoints = new int [queries.length];

        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            int circleX = queries[i][0];
            int circleY = queries[i][1];
            int radius = queries[i][2];

            for (int j = 0; j < points.length; j++) {
                int pointX = points[j][0];
                int pointY = points[j][1];
                int distance = sqrt(((pointX - circleX)^2) + ((pointY - circleY)^2));

                if (distance <= radius) {
                    count++;
                }

            }

            validPoints[i] = count;
        }

        return validPoints;
    }

}
