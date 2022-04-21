/*
    Attempt 1

    Source: https://leetcode.com/problems/reverse-integer/

    Possible input:
    - 32-bit integer within the range of [-231, 231 - 1]
    - positive or negative

    Possible output:
    - 0 >> if the number after reversal is outside of the range
    - the reversed integer

    Assumptions:
    - input can be an integer with 1 to 10 digits

    Soulution: create a string out of the digits in reverse order

    Analysis:
    Time complexity - O (n)
    Space complexity - O (1)
*/

class Solution {
    public int reverse(int x) {
        int multiplier = 10;
        int lastDigiit = 0;
        String tempInt = "";
        if (x > 9) {
            while (x / multiplier < .1){
                lastDigiit = x % multiplier;
                String newDigit = Integer.toString(lastDigiit);
                tempInt += newDigit;
                multiplier *= 10;
            }
            int reversedInt = Integer.valueOf(tempInt);
            if (x < 0) return reversedInt*(-1);
            else return reversedInt;
        }
        else return x;
    }
}