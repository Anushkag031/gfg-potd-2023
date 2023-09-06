class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        
        List<List<Integer>> li=new ArrayList<>();
        
        for(int i=0; i<V; i++)
        {
            li.add(new ArrayList<>()); //total nodes added in the list
        }
        for(int i=0; i<edges.length; i++)
        {
            li.get(edges[i][0]).add(edges[i][1]);  //0-->1st index
            li.get(edges[i][1]).add(edges[i][0]);  //1st-->0
        }
        return li;
    }
}
