class Solution {
    int minDist(int a[], int n, int x, int y) {
        // code here
        int A=-1,B=-1;
        int ans=Integer.MAX_VALUE;
        for(int i=0; i<n; i++)
        {
            if(a[i]==x)
            A=i;
            if(a[i]==y)
            B=i;
            if(A!=-1 && B!=-1)
             ans=Math.min(ans,Math.abs(A-B));
            
        }
        if(A==-1 || B==-1) ans=-1;
        return ans;
    }
}
