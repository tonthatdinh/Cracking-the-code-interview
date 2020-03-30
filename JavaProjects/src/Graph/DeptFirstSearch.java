package Graph;

class DeptFirstSearch{
    private boolean[] marked;
    private int[] edgeTo;
    private int s;

    private void DFS(Graph G, int v){
        marked[v] = true;
        System.out.println(v);
        for(int w : G.adj(v)){
            if (!marked[w]){
                edgeTo[w] = v;
                DFS(G, w);
            }
        }
    }

    public DeptFirstSearch(Graph G, int s){
        System.out.println("Start Depth First Search");
        marked = new boolean[G.getV()];
        edgeTo = new int[G.getV()];
        for(int i = 0; i < G.getV(); i ++){
            marked[i] = false;
            edgeTo[i] = -1;
        }

        DFS(G, s);
    }
    public static void main(String args[]){
        System.out.println("This chapter is about graph algorithm");
        Graph graph = new Graph(5);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(1,3);
        graph.addEdge(1, 4);
        graph.addEdge(0, 1);
        DeptFirstSearch deptFirstSearch = new DeptFirstSearch(graph, 1);
    }
}
