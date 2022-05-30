package akash.queue;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {

		//it follows natural ordering 
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        pq.add(3);
        pq.add(5);
        pq.add(7);
        pq.add(1);
        pq.add(9);
        
        System.out.println(pq.size() + " - " + pq);
        System.out.println(pq.size() + " - " + pq.poll());
        System.out.println(pq.size() + " - " + pq);
	}
}