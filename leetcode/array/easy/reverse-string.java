/*
    Attempt 1

    Source: https://leetcode.com/problems/reverse-string/submissions/

    Possible input:
    - array of characters
    - empty array

    Possible output:
    - array of original characters in reversed order
    - empty array

    Assumptions:
    - the last element in the stack will be the first element in the array (following LIFO)

    Soulution: reverse a string using an in-place algorithm with O(1) space complexity
    - instantiate a stack of type char (remember that char is a primitive datatype so you need to use Stack<Character> charStack = new Stack<>();)
    - push every element in the array onto the stack
    - replace n elements from 0 to n-1 with the character that is popped from the stack

    Analysis:
    Time complexity - O (n)
    Space complexity - O (1)
*/

class Solution {
    public void reverseString(char[] s) {
        // create a stack for the string
        Stack<Character> myString = new Stack<>();
        
        for (int i = 0; i < s.length; i++){
            myString.push(s[i]);
        }
        for (int i = 0; i < s.length; i++){
            s[i] = myString.pop();
        }
    }
}