class Solution {

    int numberOfEnclaves(int[][] grid) {

        // Your code here
        
        int n=grid.length,m=grid[0].length;

        //convert the 1's present in the borders along with their four directional 1's into 2's

        for(int i=0;i<n;i++) 
            if(grid[i][0]==1) dfs(grid,i,0,n,m);

        for(int j=0;j<m;j++) 
            if(grid[0][j]==1) dfs(grid,0,j,n,m);

        for(int i=0;i<n;i++) 
            if(grid[i][m-1]==1) dfs(grid,i,m-1,n,m);

        for(int j=0;j<m;j++) 
            if(grid[n-1][j]==1) dfs(grid,n-1,j,n,m);

        //Now we have 1's only present inside the boundary so we can count them

        int count=0;

        for(int i=0;i<n;i++)
        {   
            for(int j=0;j<m;j++) 
                if(grid[i][j]==1) count++;
        }
        return count;
    }
void dfs(int grid[][],int i,int j,int n,int m){

        if(i<0 || i>=n || j<0 || j>=m || grid[i][j]!=1) return;

        grid[i][j]=2;

        dfs(grid,i-1,j,n,m);

        dfs(grid,i,j-1,n,m);

        dfs(grid,i+1,j,n,m);

        dfs(grid,i,j+1,n,m);

    }
}
