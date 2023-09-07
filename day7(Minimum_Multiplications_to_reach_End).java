    class Pair
    {
        int first;
        int second;
        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
        
    }
class Solution {
    int minimumMultiplications(int[] arr, int start, int end)
{
        if(start==end) return 0;

        Queue<Pair> q=new LinkedList<>();
        int visited[] =new int[100000];
        q.add(new Pair(0,start));
        // Your code here
        while(q.size()>0)
        {
            Pair p=q.remove();
            int steps=p.first;
            int num=p.second;

            for (int i = 0; i < arr.length; i++)
            {
                 long temp=arr[i]*num%100000;
                 int ns=(int)temp;
                 if(ns==end) return steps+1;
                 if(visited[ns]==0)
                 {
                    q.add(new Pair(steps+1, ns));
                    visited[ns]=1;
                 }
            }
        }
      return -1;
   }
}
