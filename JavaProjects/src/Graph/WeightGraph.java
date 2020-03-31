package Graph;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Vector;

class Node{
    int vertex;
    int weigth;

    public Node(int vertex, int weigth){
        this.vertex = vertex;
        this.weigth = weigth;
    }
}

class NodeComparator implements Comparator<Node>{

    @Override
    public int compare(Node node, Node node2) {
        if (node.weigth < node2.weigth)
            return 1;
        else if (node.weigth > node2.weigth)
            return -1;
        return 0;
    }
}
public class WeightGraph {
    private int V;
    private Vector<Node> adj[];
    private boolean[] visited;
    private int[] dist;
    public WeightGraph(int V){
        this.V = V;
        adj = new Vector[V];
        for(int i = 0; i < V; i ++){
            adj[i] = new Vector<>();
        }
    }

    public void addEdge(int u, int v, int w){
        adj[u].add(new Node(v, w));
    }

    public void printGraph(){
        for(int i = 0; i < V; i ++){
            System.out.print("Node " + i + " linked with ");
            for(int j = 0; j < adj[i].size(); j ++){
                int v = adj[i].get(j).vertex;
                int w = adj[i].get(j).weigth;
                System.out.print("vertex =" + v + " with weight = " + w + ",");
            }
            System.out.println();
        }
    }

    public void Dijkstra(int source){
        dist = new int[V];
        for(int i = 0; i < V; i ++)
            dist[i] = Integer.MAX_VALUE;
        PriorityQueue<Node> priorityQueue = new PriorityQueue<Node>(100,
                new NodeComparator());
        priorityQueue.add(new Node(source, 0));
        dist[source] = 0;

        while (!priorityQueue.isEmpty()){
            int u = priorityQueue.peek().vertex;
            priorityQueue.poll();

            for(int i = 0; i < adj[u].size(); i ++){
                int v = adj[u].get(i).vertex;
                int w = adj[u].get(i).weigth;

                if (dist[u] + w < dist[v]){
                    dist[v] = dist[u] + w;
                    priorityQueue.add(new Node(v, dist[v]));
                }
            }
        }

        for(int i = 0; i < V; i ++) System.out.println(i + " " + dist[i]);
    }
    public static void main(String args[]){
        System.out.println("HELO WORLD " + "WEIGHTED GRAPH");
        WeightGraph weightGraph = new WeightGraph(5);
        weightGraph.addEdge(0, 1, 3);
        weightGraph.addEdge(0, 2, 3);
        weightGraph.addEdge(0, 3, 4);
        weightGraph.addEdge(1, 0, 1000);
        weightGraph.addEdge(1, 2, 2000);
        weightGraph.addEdge(1, 3, 3000);
        weightGraph.addEdge(2, 3, 3000);
        weightGraph.addEdge(3, 4, 4000);

        weightGraph.printGraph();
        weightGraph.Dijkstra(0);
    }
}
