class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public void dfsr(ArrayList <Integer> dfs,int node,ArrayList<ArrayList<Integer>> adj,boolean vis[]){
        dfs.add(node);
        for(int i=0;i<adj.get(node).size();i++){
            int n=adj.get(node).get(i);
            if(vis[n]==false){
                vis[n]=true;
                dfsr(dfs,n,adj,vis);
            }
        }
        
    }
    
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        ArrayList <Integer> dfs=new ArrayList<>();
        boolean vis[] = new boolean[adj.size()];
        vis[0]=true;
        dfsr(dfs,0,adj,vis);
        return dfs;
    }
}
