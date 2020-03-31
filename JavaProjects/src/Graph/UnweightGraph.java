package Graph;

import java.util.Vector;

public class UnweightGraph {
    private int V;
    private Vector<Integer> adj[];
    private boolean[] visited;

    public UnweightGraph(int V){
        this.V = V;
        adj = new Vector[V];
        for(int i = 0; i < V; i ++){
            adj[i] = new Vector<>();
        }
    }

    public void addEdge(int u, int v){
        adj[u].add(v);
        adj[v].add(u);
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

    private void DFS(int u) {
        visited[u] = true;
        System.out.println(u);
        for(int i = 0; i < adj[u].size(); i ++){
            int v = adj[u].get(i);
            if (!visited[v])
                DFS(v);
        }
    }

    public void DeptFirstSearch(int source){
        visited = new boolean[this.V];
        for(int i = 0; i < V; i ++)
            visited[i] = false;
        System.out.println("Starting Depth first Search");
        DFS(source);
    }


    public static void main(String args[]){
        System.out.println("HELLO World");
        UnweightGraph unweightGraph = new UnweightGraph(5);
        unweightGraph.addEdge(0, 1);
        unweightGraph.addEdge(0, 2);
        unweightGraph.addEdge(1, 2);
        unweightGraph.addEdge(1, 3);
        unweightGraph.printGraph();
        unweightGraph.DeptFirstSearch(1);
    }
}
