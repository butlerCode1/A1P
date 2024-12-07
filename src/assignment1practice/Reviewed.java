package assignment1practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Reviewed {
	
	//Create the Reviewed list which 
	//will be to place the nodes which will have
	//been reviewed 
	ArrayList<Integer> reviewed = new ArrayList<Integer>();
	
	//This block of code will add specified nodes to the 
	//reviewed ArrayList that was just created.
	public void addNodeToReviewedList(int node) {
		reviewed.add(node);
	}
	
	//This block of code will determine if the specified
	//node is in the reviewed list. If the specified node
	// is not in the reviewed list then it will return false.
	public boolean isNodeReviewed(int node) {
		Iterator<Integer> itreviewed = reviewed.iterator();
		
		while(itreviewed.hasNext()) {
			if(itreviewed.next() == node) {
				return true;
			}
		} 
		return false;
	}
	

	
}
