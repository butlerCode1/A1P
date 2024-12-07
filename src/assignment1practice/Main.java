package assignment1practice;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		//initialize the matrix
		int nodes = 9;
		Matrix m = new Matrix(nodes);
		
		//connect the nodes together
		//make it makes sense lol
		m.connectNodes(0, 1);
		m.connectNodes(0, 2);
		m.connectNodes(1, 3);
		m.connectNodes(1, 4);
		m.connectNodes(2, 5);
		m.connectNodes(4, 6);
		m.connectNodes(5, 7);
		m.connectNodes(6, 8);
		
		//establish the root node and the goal node
		int root = 0;
		int goal = 6;
		
		//create the reviewed List
		Reviewed r = new Reviewed();
		
		//Create a Queue
		Queue<Integer> q = new LinkedList<Integer>();
		
		//run algorithm
		run(m, root, goal, nodes, r, q);

	}

	// the run method displays the search order used by the breadth
	// first search alg to find the specified goal in the specified graph
	public static void run(Matrix m, int root, int goal, int nodes, Reviewed r, Queue<Integer> q) {

		// declare the variable that will be used to store the
		// dequeued nodes
		int node;// the dequeued nodes

		// enqueue the root node
		q.add(root);

		// Make a Sout print statement after you enqueue the root
		System.out.print("Search order is :");

		// Start the bulk of the algorithm
		// while the queue is not empty
		while (!q.isEmpty()) {

			// dequeue a node
			node = q.remove();

			// if the dequeued node is equal to the goal, stop
			// the algorithm
			if (node == goal) {
				// Print out the goal
				//System.out.println("Goal has been found: " + node);
				System.out.println(node + " ");
				break;
			} else {
				// Loop through all the nodes in the graph
				// starting with the loop
				for (int i = 0; i < nodes; i++) {
					//if the current node hasnt been reviewed and 
					//its adjacent to the dequeued node.
					if(!r.isNodeReviewed(i) && m.isNodeAdjacent(node, i)) {
						//enqueue the current node
						q.add(i);
					}
				}
				
				// add dequeued node to the reviewed list
				System.out.print(node + " ");
				r.addNodeToReviewedList(node);
			}
		}
		System.out.println();
	}

}
