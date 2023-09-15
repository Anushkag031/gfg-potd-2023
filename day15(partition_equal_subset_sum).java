class Solution{
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum=0; //initial sum to array(total)
        for(int x:arr)
        {
            sum=sum+x;
        }
        if(sum%2==1) return 0;  
        sum=sum/2; //divind the sum into two equal part
        
        int dp[][]=new int[N+1][sum+1];
        for(int i=0;i<=N;i++)
        {
            dp[i][0]=1;
            
        }
        for(int i=1; i<=N; i++){
            for(int j=0; j<=sum;j++){
                if(arr[i-1]<=j){
                dp[i][j]=dp[i-1][j]+dp[i-1][j-arr[i-1]];
                }
                else{
                dp[i][j]=dp[i-1][j];
                }
                
            }
        }
        return dp[N][sum]!=0?1:0;
            
    }
}
