package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Graph{
    private int V;
    Vector<Integer>[] adj;

    public Graph(int V){
        this.V = V;
        adj = new Vector[V];

        for(int v = 0; v < V; v++){
            adj[v] = new Vector<Integer>();
        }

    }

    public void addEdge(int v, int w){
        adj[v].add(w);
        adj[w].add(v);
    }

    public Iterable<Integer> adj(int v){
        return adj[v];
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
}




