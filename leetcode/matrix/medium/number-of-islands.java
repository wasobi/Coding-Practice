/*
Attempt 1

Source: https://leetcode.com/problems/number-of-islands/

*/

class Solution {
    int numIslands = 0;
    public int numIslands(char[][] grid) {
        
        for (int i = 0; i < numIslands.length(); i++){
            int j = 0;
            countIslands(numIslands[i],i,j);
        }
        return numIslands;
    }
    private void countIslands(char[] row, int i, int j){
        // perform DFS to find out if the points in the grid are a part of an island
        // visit every point in the grid
        // if we find an island, search until we reach the end of an island
        if (row[i][j] == "1") {
            row[i][j] = "-";
        }
        else if (row[i][j] == "0"){
            numIslands++;
            countIslands(i+1,j);
        }
        else {
            if (row[i-1][j] == "1"){
                countIslands(i-1,j);
            }
            else {
                // todo
            }
        }
        // increment j to check the next point in the row
        j++;
    }
}