class Solution {
    String mark="$";
    HashSet<String> subtree=new HashSet<>();
    int dupSub(Node root) {
        // code here 
        String str=dup(root);
        if(str.equals("#")) return 1;
        else return 0;
    }
    
String dup(Node root)
{
    StringBuilder s=new StringBuilder();
    s.append("");
    if(root==null) 
    return s.append(mark).toString();
    
    String lstr=dup(root.left);
    if(lstr.equals("#")) return "#";
    
     String rstr=dup(root.right);
    if(rstr.equals("#")) return "#";
    
    s.append(root.data).append(lstr).append(rstr);
    
    if(s.length()>3 && subtree.contains(s.toString()))
    return "#";
    
    subtree.add(s.toString());
    return s.toString();
    }
}
