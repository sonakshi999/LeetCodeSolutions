class Solution {
    public int uniquePathsIII(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int zero = 0, sx = 0, sy = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(grid[i][j] == 0) {
                    zero++;
                } else if(grid[i][j] == 1) {
                    sx = i;
                    sy = j;
                }
            }
        }
        return dfs(grid,sx,sy,zero);
    }
    int dfs(int[][] grid,int x,int y,int z) {
        if(x<0 || y<0 || x >= grid.length || y >= grid[0].length || grid[x][y] == -1) {
            return 0;
        }
        if(grid[x][y] == 2) {
            return z == -1 ? 1 : 0;
        }
        grid[x][y] = -1;
        z--;
        int totalP = dfs(grid,x+1,y,z) 
            + dfs(grid,x,y+1,z) 
            + dfs(grid,x-1,y,z) 
            + dfs(grid,x,y-1,z);
        grid[x][y] = 0;
        z++;
        return totalP;
    }
}