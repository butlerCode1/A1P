package assignment1practice;

public class Matrix {
	//create the Matrix as an empty array
	int [][] matrix;
	
	//Create the code that initializes the matrix 
	//having a specified number of nodes in the 
	//form of a constructor
	public Matrix(int nodes) {
		matrix = new int [nodes][nodes];
	}
	
	//creates the connectivity between the node 
	//specified as the row to the node  specified
	//as the column
	public void connectNodes(int row, int col) {
		matrix[row][col] = 1;
	}
	
	//determines if the node specified as the row is 
	//connected to the node specified as the column
	public boolean isNodeAdjacent (int row, int col) {
		return (matrix[row][col]==1);
	}
	
	//Loop through the array setting the values back to
	//0
	public void resetNodes() {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = 0;
			}
		}
	}
	
}
