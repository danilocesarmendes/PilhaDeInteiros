package br.com.beblue;

import java.util.Stack;

public class StackBeblue {

	// creating stack
	private static Stack<Integer> st = new Stack<Integer>();

	public static void push(Integer value) {
		// populating stack
		st.push(value);
	}

	/**
	 * remove top object
	 */
	public static void pop() {
		// populating stack
		st.pop();
	}
	
	/**
	 * @return show minimum element 
	 */
	public static Integer min() {
		Integer min = st.get(0);
		
		for(Integer value : st) {
			if(value < min) {
				min = value;
			}
		}
		return min;
	}

	/**
	 * remove top object
	 */
	public static void showStack() {
		// elements after remove
		System.out.println("\nelements of stack: " + st);
	}
	
		/**
	 * 
	 * @param object
	 * @return true when object removed
	 */
	public static boolean removeObject(Integer object) {
		return st.remove(object);
	}

}
