import  java.util.*;
public class DFSTraversalGraph {
    int v ; // Number of Vertices
    List<List<Integer>> adjList =new LinkedList<>(); // Adjacency List
    // Constructor
    DFSTraversalGraph(int v){

        this.v = v;
        adjList = new LinkedList<>();
        for(int i = 0; i < v ; i ++){
            // initialize each list
            adjList.add(new ArrayList<>());
        }
    }
    //add edges (undirected graph)
    void addEdges(int u, int v ){
        adjList.get(u).add(v);
        adjList.get(v).add(u);  
    }

    void printGraph(){
        for(int i = 0; i < v ; i ++){
            System.out.print(i+" -> ");
            for(int n : adjList.get(i)){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }

    void DFSTraversal(int node , boolean visited[]){
        visited[node] = true;
        System.out.println(node+"");
        for(int n : adjList.get(node)){
            if(!visited[n]){
                DFSTraversal(n,visited);
            }
        }
    }
    public static void main(String[] args){
        DFSTraversalGraph graph = new DFSTraversalGraph(5);
        graph.addEdges(0,1);
        graph.addEdges(0,4);
        graph.addEdges(1,2);
        graph.addEdges(2,4);
        graph.addEdges(3,4);
        System.out.println("Adjacency List :");
        graph.printGraph();
    }
}


