package Graph;

import java.util.Vector;

public class DirectedGraph {
    private int V;
    private Vector<Integer> adj[];

    private boolean[] marked;
    private int[] edgeTo;
    private int s;

    public DirectedGraph(int V){
        this.V = V;
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


    private void DFS(int i) {
    }
    public static void main(String args[]){
        System.out.println("This chapter is about Directed Graph");
        DirectedGraph directedGraph = new DirectedGraph(5);
        directedGraph.addEdge(0, 1);
        directedGraph.addEdge(0, 2);
        directedGraph.addEdge(1,2);
        directedGraph.addEdge(1, 3);
        directedGraph.DFS(0);
    }


}
