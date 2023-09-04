class Solution{
    static char[][] fill(int n, int m, char a[][])
    {
        // code here
         for(int i = 0; i<n; i++){
            //1st col
            if(a[i][0] == 'O'){
                dfs(i , 0 , n , m, a);
            }
            //last col
            if(a[i][m-1] == 'O'){
                dfs(i , m-1 , n , m, a);
            }
            
        }
        for(int j = 0; j<m; j++){
            //1st row
            if(a[0][j] == 'O'){
                dfs(0 , j , n , m, a);
            }
            //last row
            if(a[n-1][j] == 'O'){
                 dfs(n-1 , j , n , m, a);
            }
            
        }
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(a[i][j] == '0') a[i][j] = 'O';
                else if(a[i][j] == 'O') a[i][j] = 'X';
            }
        }
        return a;
        
    }
    
    static void dfs(int r, int c, int n, int m, char a[][]){
        // System.out.println(r+" "+c);
        if(r>=n || c>= m || r<0 || c<0) return;
        if(a[r][c] == '0' || a[r][c] == 'X') return;
        
        
        a[r][c] = '0';
        dfs(r+1 ,c , n, m , a);
        dfs(r-1 , c, n,m , a);
        dfs(r , c+1, n,m,a);
        dfs(r, c-1, n,m,a);
    }
}
