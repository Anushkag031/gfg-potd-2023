//problem link: https://practice.geeksforgeeks.org/problems/leaf-under-budget/1

class Solution{
    public int getCount(Node node, int bud)
    {
        //code here  
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(node,1)); //root,level
        int count=0; //no of leaf visited
        int sum=0; //cost
        
        while(q.size()>0)
        {
            Node temp=q.peek().a;
            int level=q.peek().b;
            q.remove();
            if(temp.left==null && temp.right==null)
            {
                count++;
                sum=sum+level;
                if(sum>bud) return count-1;
                if(sum==bud)  return count;
            }
            if(temp.left!=null)
            q.add(new Pair(temp.left,level+1));
            
            if(temp.right!=null)
            q.add(new Pair(temp.right,level+1));
            
        }
        return count;
    }
}
class Pair{
    Node a;
    int b;
    Pair(Node a, int b){
        this.a=a;
        this.b=b;
    }
}
