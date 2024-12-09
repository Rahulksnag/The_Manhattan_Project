class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> bfs=new ArrayList<>();
        bfs.add(0);
        boolean vis[] = new boolean[V];
        vis[0]=true;
        Queue <Integer> q = new LinkedList<>();
        q.offer(0);
        //at.add(V);
        while(!q.isEmpty()){
            int ins= q.remove();
            for(int i=0; i<adj.get(ins).size();i++){
                if(vis[adj.get(ins).get(i)]==false){
                    vis[adj.get(ins).get(i)]=true;
                    bfs.add(adj.get(ins).get(i));
                    if(bfs.size()==V){return bfs;}
                    q.offer(adj.get(ins).get(i));
                }
            }
            
        }
        //System.out.println(adj.get(0).get(0));
        
        return bfs;
    }
}
