class solution
{
    ArrayList<Node> al;
    Node buildBalancedTree(Node root) 
    {
        //Add your code here.
        al=new ArrayList<>();
        inorder(root);
        return balancedTree(0,al.size()-1);
    }
    void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            al.add(root);
            inorder(root.right);
        }
    }
    
    Node balancedTree(int l, int r)
    {
        if(l>r) return null;
        int m=(l+r)/2;
        
        Node root=al.get(m);
        root.right=balancedTree(m+1,r);
        root.left=balancedTree(l,m-1);
        
        return root;
    }
    
    
}
