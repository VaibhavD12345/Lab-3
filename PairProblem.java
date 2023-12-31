package FirstPracticeOfBST;

import java.util.HashSet;
import java.util.Set;

public class PairProblem {
	
	public static void main(String[] args) {
		Node root = null;
		
		Node node =new Node();
		
		root=node.insert(root,40);
		root=node.insert(root,20);
		root=node.insert(root,60);
		root=node.insert(root,10);
		root=node.insert(root,30);
		root=node.insert(root,50);
		root=node.insert(root,70);
		
		PairProblem pairProblem=new PairProblem();  
		
		
		pairProblem.pairProblemWithSum(root, 130);
}
	

	public void pairProblemWithSum(Node root,int sum) {
		Set<Integer> set=new HashSet<>();
		
		if (!pairProblemutil(root, sum, set)) {
			System.out.println("Pair not found");
		}
		  
		  }
		
      public boolean pairProblemutil(Node root, int sum, Set<Integer> set) {
	  if(root==null) {
	  return false;
	  }
	  
	  if(pairProblemutil(root.left, sum, set)) {
		  return true;
	  
	  }
	  
	  if (set.contains(sum-root.value)) {
		  System.out.println("Pair is :"+ root.value+ ":" +(sum-root.value)) ;
		  return true;
	  }
	  else {
	  set.add(root.value);
	  }
	  
	  return pairProblemutil(root.right, sum, set);
      }
     
	}


