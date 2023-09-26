class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        int n=arr.length;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        if(n<4) return ans;
        Arrays.sort(arr);
        
        for(int i=0; i<n-3; i++)
        {
            if(arr[i]>0 && arr[i]>k) break; // quad cant be formed
            if(i>0 && arr[i]==arr[i-1]) continue; //checking duplicacy
            
            for(int j=i+1; j<n-2; j++)
            {
                if(j>i+1 && arr[j]==arr[j-1]) continue; //checking duplicacy
                //using two sum approach
                
                int K=j+1; //start //left
                int L=n-1; //end // right
                while(K<L)
                {
                    int prev_start=K;
                    int prev_end=L;
                    
                    int sum= arr[i] + arr[j] + arr[K] + arr[L];
                    if(sum==k)
                    {
                        ArrayList<Integer> temp= new ArrayList<Integer>(
                            Arrays.asList(arr[i], arr[j], arr[K], arr[L]));
                            ans.add(temp);
                            
                        while(K<L && arr[K]==arr[prev_start]) K++; //checking duplicacy
                        while(K<L && arr[L]==arr[prev_end]) L--;
                    }
                    else if(sum>k)
                    {
                        L--;
                    }
                    else //(sum<k)
                    {
                        K++;
                    }
                }
            }
        }
        return ans;
    }
}
