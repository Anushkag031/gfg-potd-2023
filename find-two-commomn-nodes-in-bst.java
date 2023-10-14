class Solution
{
    static ArrayList<Integer> ans;
    static HashSet<Integer> set;
    
    
    //Function to find the nodes that are common in both BST.
	public static ArrayList<Integer> findCommon(Node root1,Node root2)
    {
        //code herepublic static ArrayList<Integer> findCommon(Node root1,Node root2)
         ans = new ArrayList<>();
        set = new HashSet<>();
        preorder(root1);
        preorder(root2);
        Collections.sort(ans);
        return ans;
    }
    
     static void preorder(Node root){
        if(root == null){
            return ;
        }
        if(set.contains(root.data)){
            ans.add(root.data);
        }else{
            set.add(root.data);
        }
        preorder(root.left);
        preorder(root.right);
    
    }
}

    
	
