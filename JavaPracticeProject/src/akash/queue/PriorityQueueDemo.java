package akash.queue;

import java.util.Queue;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		queue.add(15);
		queue.add(5);
		queue.add(95);
		queue.add(0);
		queue.add(45);
		queue.add(21);
		queue.offer(0);

		System.out.println(queue.peek()); // peek will retrieve but not remove
		System.out.println(queue.poll()); // poll will retrieve and remove that data
		System.out.println(queue.offer(15));
	
		queue.remove(25);//this remove 25 number of object
	
		System.out.println("\n");
		

		getQueueData(queue);
		
		

	}

	public static PriorityQueue<Integer> getQueueData(PriorityQueue<Integer> e) {
		Iterator<Integer> et = e.iterator();
		while (et.hasNext()) {
			System.out.println(et.next());
		}
		return null;	
	}
}
