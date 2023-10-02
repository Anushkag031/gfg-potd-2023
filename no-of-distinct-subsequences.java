class Solution {
    public int distinctSubseqII(String S) {
    int mod=1000000007;
        int n=S.length();
        long arr[]=new long[26];
        Arrays.fill(arr,-1); //-1 indicates no repeatition
        
        long ans=0; //total no of ds till i-1th char
        long diff=0; // total no of s of ith char
        
        for(int i=0; i<n;i++)
        {
            int x=S.charAt(i)-'a';
            if(i==0)
            {
                ans=1;
                arr[x]=1;
                continue;
            }
            diff=1+ans;
            //if no diff char found
            if(arr[x]==-1)
                ans=(ans+diff)%mod;
            else
                ans=(ans+diff-arr[x])%mod;
                arr[x]=diff;
        }
        ans=ans+1;
        
        return (int)(ans<0?ans+mod:ans);
    
    }
}
