package Graph;

import java.util.Vector;

public class DirectedGraph {
    private int V;
    private Vector<Integer> adj[];
    private boolean[] visited;
    public DirectedGraph(int V){
        this.V = V;
        adj = new Vector[this.V];
        for(int v = 0; v < V; v ++)
            adj[v] = new Vector<Integer>();
    }
    public int getV() {
        return V;
    }

    public void setV(int v) {
        V = v;
    }

    public Vector<Integer>[] getAdj() {
        return adj;
    }

    public void setAdj(Vector<Integer>[] adj) {
        this.adj = adj;
    }


    public void addEdge(int v, int w){
        adj[v].add(w);
    }


    private void DFS(int u) {
        visited[u] = true;
        System.out.println(u);
        for(int i = 0; i < adj[u].size(); i ++){
            int v = adj[u].get(i);
            if (!visited[v])
                DFS(v);
        }
    }

    public void printGraph(){
        for(int i = 0; i < V; i ++){
            System.out.print("Node " + i + " linked with ");
            for(int j = 0; j < adj[i].size(); j ++){
                int v = adj[i].get(j);
                System.out.print(v + "," );
            }
            System.out.println();
        }
    }

    public void DepthFirstSearch(int source){
        visited = new boolean[this.V];
        for(int i = 0; i < this.V; i ++)
            visited[i] = false;
        System.out.println("Starting Depth First Search in Directed Graph");
        DFS(source);
    }
    public static void main(String[] args){
        System.out.println("This chapter is about Directed Graph");
        DirectedGraph directedGraph = new DirectedGraph(5);
        directedGraph.addEdge(0, 1);
        directedGraph.addEdge(0, 2);
        directedGraph.addEdge(1,2);
        directedGraph.printGraph();
        directedGraph.DepthFirstSearch(0);
    }


}
