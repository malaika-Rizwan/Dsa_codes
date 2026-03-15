package graph;

public class Graph {



	    int v;
	    int[][]adjlist;

	    // Constructor
	    Graph(int v) {
	       this. v = v;
	        adjlist = new int[v][v];

	        for (int i = 0; i < v; i++) {
	            adjlist = new int[v][v];
	        }
	    }

	    // Add edge (undirected graph)
	    void addEdge(int u, int v) {
	        adjlist[u][v]=1;
	        adjlist[u][v]=1;
	    }

	    // Display graph
	    void displayGraph() {
	    	 System.out.println("adjacency matrix of the graph:");
	        for (int i = 0; i < v; i++) {
	            
	            for (int j=0 ;j<v;j++) {
	                System.out.print(adjlist[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	  
	    

	    // Main method
	    public static void main(String[] args) {
	        Graph g = new Graph(5);

	        g.addEdge(0, 1);
	        g.addEdge(0, 4);
	        g.addEdge(1, 2);
	        g.addEdge(1, 3);
	        g.addEdge(1, 4);
	        g.addEdge(2, 2);
	        g.addEdge(3, 4);

	       
	        g.displayGraph();
            
	       
	    }
	}