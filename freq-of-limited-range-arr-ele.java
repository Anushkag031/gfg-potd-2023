class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
       // HashMap<Integer,Integer> map=new HashMap<>();
       int [] freq= new int[Math.max(N+1,P+1)];
        for(int i=0; i<N; i++)
        {
            freq[arr[i]]++;
        }
        for(int i=1;i<=N;i++)
        {
           arr[i-1]=freq[i]; 
        }
    }
}
