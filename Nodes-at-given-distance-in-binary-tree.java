

//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right;
// }

class Solution
{
    public static ArrayList<Integer> KDistanceNodes(Node root, int tar , int k)
    {
        // return the sorted list of all nodes at k dist
        Node target = findTarget(root,tar);
        
        HashMap<Node, Node> parent=new HashMap<>();
        
        markParent(root,parent);
        
        ArrayList<Integer> res=fun(parent, target, k);
        return res;
    }
    static void markParent(Node root, HashMap<Node, Node> parent)
    {
        Queue<Node> q=new LinkedList<>();
        
        q.add(root);
        
        while(!q.isEmpty())
        {
            Node curr=q.poll();
            
            if(curr.left!=null)
            {
                parent.put(curr.left,curr);
                q.add(curr.left);
            }
            if(curr.right!=null)
            {
                parent.put(curr.right,curr);
                q.add(curr.right);
            }
        }
    }
    
    static ArrayList<Integer> fun(HashMap<Node, Node> parent, Node target, int k)
    {
        Queue<Node> q=new LinkedList<>();
        HashSet<Node> vis=new HashSet<>();
        
        q.add(target); vis.add(target);
        
        int count=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            
            if(count==k) break;
            count++;
            
            
            for(int i=0; i<size; i++)
            {
                Node curr=q.poll();
                if(curr.left!=null && !vis.contains(curr.left))
                {
                    q.add(curr.left);
                    vis.add(curr.left);
                }
                if(curr.right!=null && !vis.contains(curr.right))
                {
                    q.add(curr.right);
                    vis.add(curr.right);
                }
                if(parent.get(curr)!=null && !vis.contains(parent.get(curr)))
                {
                    q.add(parent.get(curr));
                    vis.add(parent.get(curr));
                }
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        while(!q.isEmpty())
        {
            Node curr=q.poll();
            ans.add(curr.data);
        }
        Collections.sort(ans);
        return ans;
    }
    static Node findTarget(Node root, int target)
    {
        if(root==null ||root.data==target)
        return root;
        
        Node left=findTarget(root.left,target);
        Node right=findTarget(root.right,target);
        
        if(left!=null)
        return left;
        
        return right;
    }
};
