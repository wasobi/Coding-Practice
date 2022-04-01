/*
    Attempt 1

    Source: https://www.pramp.com/challenge/15oxrQx6LjtQj9JK9XqA
    Solution: https://www.pramp.com/question/15oxrQx6LjtQj9JK9XqA

    Possible input:
    - 

    Possible output:
    -

    Assumptions:
    -

    Soulution:
    -

    Analysis:
    Time complexity - O ()
    Space complexity - O ()
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

    int getCheapestCost(Node rootNode) {
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
        parent =
      }
    }
  }

  /*********************************************
   * Driver program to test above method     *
   *********************************************/

  public static void main(String[] args) {

  }
}
