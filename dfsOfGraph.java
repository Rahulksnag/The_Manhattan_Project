class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        Stack <Integer> st=new Stack<>();
        st.push(0);
        ArrayList <Integer> dfs=new ArrayList<>();
        //dfs.add(0);
        boolean vis[] = new boolean[adj.size()];
        vis[0]=true;
        while(!st.isEmpty()){
            // dfs.add(1);
            // return dfs;

            // return dfs;


            int ins=st.pop();
            dfs.add(ins);
            //if(dfs.size()==adj.size()){return dfs;}
            //int elem=adj.get(ins).size();
            for(int i=adj.get(ins).size()-1;i>=0;i--){
                int nei = adj.get(ins).get(i);
                if(vis[nei]==false){
                    vis[nei]=true;
                    st.push(nei);
                    
                }
            }
        }
        return dfs;
    }
}
