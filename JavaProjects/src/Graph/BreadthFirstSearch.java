package Graph;

import java.util.Queue;
import java.util.*;

public class BreadthFirstSearch {
    private boolean[] marked;
    private int[] edgeTo;
    private int[] distTo;

    private void BFS(Graph graph, int source){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        marked[source] = true;
        System.out.println(source + " has visited");
        priorityQueue.add(source);
        distTo[source] = 0;

        while (!priorityQueue.isEmpty()){
            int v = priorityQueue.peek();
            priorityQueue.poll();
            for(int w : graph.adj(v)){
                if (!marked[w]){
                    System.out.println(w + "has visited");
                    priorityQueue.add(w);
                    marked[w] = true;
                    edgeTo[w] = v;
                    distTo[w] = distTo[v] + 1;
                }
            }
        }
    }

    public BreadthFirstSearch(Graph graph, int source){
        marked = new boolean[graph.getV()];
        edgeTo = new int[graph.getV()];
        distTo = new int[graph.getV()];
        System.out.println("Start Breadth First Search");
        BFS(graph, source);
    }
    public static void main(String args[]){
        System.out.println("This section is about BFS");
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch(graph, 0);
    }
}
