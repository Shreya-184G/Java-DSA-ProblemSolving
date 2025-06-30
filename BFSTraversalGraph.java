package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BFSTraversalGraph {
    int v ; // Number of Vertices
    List<List<Integer>> adjList; // Adjacency List
    // Constructor
    BFSTraversalGraph(int v){
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
            System.out.print(i+"");
            for(int n : adjList.get(i)){
                System.out.print(n+"");
            }
            System.out.println();
        }
    }

    void BFSTraversal(){
        boolean visited[] = new boolean[v];
        Queue <Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);
        System.out.println("BFS Traversal");
        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.println(node+"");
            for(int n : adjList.get(node)){
                if(!visited[n]){
                    queue.add(n);

                }
            }
        }
    }
    
    public static void main(String[] args){
        BFSTraversalGraph graph = new BFSTraversalGraph(5);
        graph.addEdges(0,1);
        graph.addEdges(0,4);
        graph.addEdges(1,2);
        graph.addEdges(2,4);
        graph.addEdges(3,4);
        System.out.println("Adjacency List :");
        graph.printGraph();
    }
}
