class Solution{
    static int dp[];
    static int palindromicPartition(String str)
    {
       
        int n= str.length();
        dp=new int[n];
        Arrays.fill(dp,-1);
        return  partitionHelper(str, 0, n)-1;
        
    }
    static int  partitionHelper(String str, int i, int n)
    {
        if(i==n) return 0;
        if(dp[i]!=-1) return dp[i];
        
        int res=Integer.MAX_VALUE;
        
        for(int j=i; j<n; j++)
        {
            if(isPalin(str,i,j))
            {
                int cost=1+ partitionHelper(str,j+1,n);
                res=Math.min(res,cost);
            }
        }
        return dp[i]=res;
    }
    static boolean isPalin(String str, int i, int j)
    {
        while(i<j)
        {
            if(str.charAt(i)==str.charAt(j))
            {
                i++;
                j--;
                
            }
            else
                return false;
        }
        return true;
    }
}
