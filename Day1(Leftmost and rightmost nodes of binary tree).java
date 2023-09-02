problem link: https://practice.geeksforgeeks.org/problems/leftmost-and-rightmost-nodes-of-binary-tree/1
class Tree
{
    public static void printCorner(Node node)
    {
        
        // add your code here  
        if(node==null) return;
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        
        while(q.isEmpty()==false){
            int n=q.size();
            
            for(int i=1; i<=n; i++){
                Node curr=q.poll();
                if(i==1||i==n){    //adding first and last element of the queue
                    System.out.print(curr.data+" ");
                }
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);
            }
        }
    }
    
}
