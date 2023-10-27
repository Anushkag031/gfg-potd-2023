

//User function Template for Java

class Solution{
    static int minimumNumberOfDeletions(String S) {
        //your code here
        /*return fun(S,0,S.length()-1);
    }
    static int fun(String S, int i, int j)
    {
        if(i>=j) return 0;
        if(S.charAt(i)==S.charAt(j))
        {
            return fun(S,i+1,j-1);
        }
        return 1+Math.min(fun(S,i,j-1),fun(S,i+1,j));
    }
}*/
        Integer [][] dp = new Integer[S.length()][S.length()];
        return S.length() - lps(S,0,S.length() - 1, dp);
    }
    public static int lps(String s , int start, int end, Integer [][] dp)
    {
        if(start > end)
        return 0;
        if(start == end)
        return 1;
        if(dp[start][end] == null)
        {
        if(s.charAt(start) == s.charAt(end))
        dp[start][end] = 2 + lps(s,start + 1, end - 1,dp);
        else
        dp[start][end] = Math.max(lps(s,start + 1, end,dp) , lps(s,start, end - 1,dp));
        }
        return dp[start][end];
    }
}
