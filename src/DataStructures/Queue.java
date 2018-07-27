package DataStructures;

import java.util.*;

public class Queue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> Q = new PriorityQueue<String>();
		
		Q.offer("first");
		Q.offer("ssecond");
		Q.offer("third");
		
		System.out.println(Q);
		System.out.println(Q.peek());
		Q.poll();
		System.out.println(Q);
	}
	

}
