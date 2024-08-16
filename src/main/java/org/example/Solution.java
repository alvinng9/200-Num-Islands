package org.example;

public class Solution {
    public int numIslands(char[][] grid) {
        int result = 0;
        //iterate through every index of the 2d grid
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                //check if the value at the index is '1'
                if (grid[i][j] == '1') {
                    //if the value is '1' add 1 to the result
                    result++;
                    //remove '1's next to the grid[i][j]
                    helper(grid, i, j);
                }
            }
        }
        return result;
    }

    public void helper(char[][] grid, int x, int y) {
        //check if the index is out of bounds
        //check if the index qualifies as part of an island
        if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] != '1') {
            return;
        }
        grid[x][y] = '0';
        //check four directions from the current index
        helper(grid, x + 1, y);
        helper(grid, x - 1, y);
        helper(grid, x, y + 1);
        helper(grid, x, y - 1);
    }
}
