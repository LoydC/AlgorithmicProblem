package tech.loyd.leetcode;

/**
 * 
 * @author Loyd
 * 463.Island Perimeter
 */
public class IslandPerimeter {
	public int islandPerimeter(int[][] grid) {
        int islands = 0, neighbours = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    islands++; // 陆地数量�?1
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) neighbours++; //判断下方是不是陆�?
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) neighbours++; //判断右方是不是陆�?
                }
            }
        }

        return islands * 4 - neighbours * 2;
    }
}
