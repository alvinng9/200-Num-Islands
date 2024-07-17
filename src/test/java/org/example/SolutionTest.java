package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void numIslandsTest() {
        Solution solution = new Solution();
        char[][] inputOne = new char[][]{
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        assertEquals(1, solution.numIslands(inputOne));

        char[][] inputTwo = new char[][]{
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        assertEquals(3, solution.numIslands(inputTwo));

        char[][] inputThree = new char[][]{
                {'0','0','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','0','0'},
                {'0','0','0','0','0'}
        };
        assertEquals(1, solution.numIslands(inputThree));

        char[][] inputFour = new char[][]{
                {'0','0','0','0','0'},
                {'0','0','0','0','0'},
                {'0','0','0','0','0'},
                {'0','0','0','0','0'}
        };
        assertEquals(0, solution.numIslands(inputFour));
    }

}