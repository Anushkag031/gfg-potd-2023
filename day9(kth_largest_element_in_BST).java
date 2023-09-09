class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        //Your code here
        ArrayList<Integer> al=new ArrayList<>();
        inorder(root,al);
        
        if(K>al.size()) return -1;
        
        return al.get(al.size()-K);
    }
    void inorder(Node root, ArrayList<Integer> al)
    {
        if(root!=null)
        {
            inorder(root.left,al);
            al.add(root.data);
            inorder(root.right,al);
        }
    }
}
