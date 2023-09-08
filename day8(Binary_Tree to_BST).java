class Solution
{
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    int index;
    Node binaryTreeToBST(Node root)
    {
       // Your code here
       if(root==null) return null;
       
       List<Integer> al=new ArrayList<>();
       inorder(al,root);
       Collections.sort(al);
       
       index=0;
       replace(al,root);
       return root;
    }
    void inorder(List<Integer> a, Node r)
    {
        if(r==null) return;
        else{
            inorder(a,r.left);
            a.add(r.data);
            inorder(a,r.right);
        }
    }
    void replace(List<Integer> a, Node root)
    {
        if(root==null) return;
        replace(a,root.left);
        root.data=a.get(index);
        index++;
        replace(a,root.right);
    }
}
