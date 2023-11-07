package FirstPracticeOfBST;

import java.util.Scanner;
import java.util.Stack;



public class BinaryTree {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the brackets");
		String input = sc.next();
		boolean result = checkBinaryTree(input);
	
		if(result) {
			System.out.println("Enter string has balanced Brackets");
		}else {
			System.out.println("Enter string does not have balanced Brackets");
			
			sc.close();
		}
		
	}
	
    static boolean checkBinaryTree(String input) {
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			
			if (ch =='(' || ch == '{' || ch =='[') {
				stack.push(ch);
				continue;
			}
			
			if(stack.isEmpty()) {
				return false;
			}
			
			char temp;
			switch (ch) {
			case ')':
				temp=stack.pop();
				if (temp =='}' || temp==']') {
				return false;
			}break;
			 case '}':
			    	temp=stack.pop();
				  if (temp ==')' || temp==']') {
				  return false;
			   }break;
			
		     case ']':
			     temp=stack.pop();
			    if (temp ==')' || temp=='}') {
			    return false;
		       }break;
			
		      default:
		    	  System.out.println("Please enter correct bracket type");
		}
	
		}		
		return stack.isEmpty();
		
    	

    }
}