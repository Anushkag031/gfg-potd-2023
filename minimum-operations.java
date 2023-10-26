/* Given a number N. Find the minimum number of operations required to reach N starting from 0. You have 2 operations available:

Double the number
Add one to the number*/





class Solution
{
    public int minOperation(int n)
    {
        //code here.
        int count=0; 
        while(n>0)
        {
            if(n%2==0)
            n=n/2;
            else 
            n--;
            
            count++;
        }
        return count;
    }
}
