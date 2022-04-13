/*
    Attempt 1

    Source: https://www.pramp.com/challenge/15oxrQx6LjtQj9JK9XqA
    Solution: https://www.pramp.com/question/15oxrQx6LjtQj9JK9XqA

    Possible input:
    - k-ary tree with n children
    - empty tree
    - k-ary tree with equivalent sales paths

    Possible output:
    - integer greater than 0

    Assumptions:
    - All nodes in a path will contain an integer between 0 and infinity

    Soulution:
    - traverse each path to the furthest child and calculate the total sales path
    - the first sales path found with be the current minPath
    --> if we find a sales path that is less than the minPath, update the minPath
    - return the minPath

    Analysis:
    Time complexity - O (n^2)
    Space complexity - O (1)
*/

/*
    Attempt 2

    Source: https://www.pramp.com/challenge/15oxrQx6LjtQj9JK9XqA
    Solution: https://www.pramp.com/question/15oxrQx6LjtQj9JK9XqA

    Possible input:
    - k-ary tree with n children
    - empty tree
    - k-ary tree with equivalent sales paths

    Possible output:
    - integer greater than 0

    Assumptions:
    - All nodes in a path will contain an integer between 0 and infinity

    Soulution:
    - traverse each path to the furthest child and calculate the total sales path
    - the first sales path found with be the current minPath
    --> if we find a sales path that is less than the minPath, update the minPath
    - return the minPath

    Analysis:
    Time complexity - O (n^2)
    Space complexity - O (1)
*/


import java.io.*;
import java.util.*;

class Solution {

  static class Node {

    int cost;
    Node[] children;
    Node parent;

    Node(int cost) {
      this.cost = cost;
      children = null;
      parent = null;
    }
  }

  static class SalesPath {
      // Attempt 1
    int getCheapestCost1(Node rootNode) {
      // check each child of the root
      boolean found = false;
      int cheapestCost = 0;
      parent = rootNode;
      while (!found) {
        int tempCost = 0;
        for (int i = 0; i < parent.children.length; i++) {
          if (parent.children[0] != null) {
            tempCost = tempCost + parent.children[i].cost;
          }
          else {
            cheapestCost = tempCost;
          }
        }
        // parent =
      }
    }
    // Attempt 2
    int getCheapestCost2(Node rootNode) {
      // check each child of the root
      int minPath = 0;
      Node currentNode = rootNode;

      while (currentNode.children != null) {

        if (current) {

        }
      }

     return minPath;
    }
  }

  /*********************************************
   * Driver program to test above method     *
   *********************************************/

  public static void main(String[] args) {

  }
}
