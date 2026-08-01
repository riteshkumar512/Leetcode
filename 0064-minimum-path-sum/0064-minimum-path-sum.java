class Solution {
    public int minPathSum(int[][] grid) {
         int[][]dp=new int[grid.length][grid[0].length];
        for (int[] a: dp){
            Arrays.fill(a,-1);
        }
        return Path_Sum(grid,0,0,dp);

    }
    public static int Path_Sum(int[][] grid,int cr,int cc,int[][] dp){
        if (cr==grid.length -1 && cc==grid[0].length-1){
            return grid[cr][cc];
        }
        if (cr>=grid.length  || cc>=grid[0].length){
            return Integer.MAX_VALUE;
        }
        if (dp[cr][cc] != -1){
            return dp[cr][cc];
        }
        int right=Path_Sum(grid,cr,cc+1,dp);
        int down=Path_Sum(grid, cr+1, cc,dp);
        return dp[cr][cc]=Math.min(right,down)+grid[cr][cc];
    }
    
}