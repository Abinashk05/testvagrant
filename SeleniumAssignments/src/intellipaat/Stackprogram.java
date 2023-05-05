package intellipaat;

import java.util.Stack;

public class Stackprogram {

	public static void main(String[] args) {
		

	
		        Stack<String> stack = new Stack<>();

		        // Pushing elements onto the stack
		        stack.push("first");
		        stack.push("second");
		        stack.push("third");

		        // Printing the top element of the stack
		        System.out.println("Top element: " + stack.peek());

		        // Popping elements off the stack
		        System.out.println("Popping elements:");
		        while (!stack.empty()) {
		            System.out.println(stack.pop());
		        }
		    }
		}


	
