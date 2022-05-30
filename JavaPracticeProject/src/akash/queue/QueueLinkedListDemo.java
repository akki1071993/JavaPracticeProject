package akash.queue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueLinkedListDemo {

	public static void main(String[] args) {
		Deque<String> q = new LinkedList<String>();
		
		q.add("Akash");
		q.add("Aneri");
		q.add("Viajy");
		q.add("Sumona");
		q.add("Akash");
		q.add("Kartik");
		q.add(null);
		q.add("Rytu");
		
		getQueueData(q);
		
		System.out.println("\n");
		
		q.removeFirst();
		q.removeLast();
		q.addFirst("Kushal");
		q.addLast("Kesha");
		getQueueData(q);
		
		

	}
	
	public static Deque<Integer> getQueueData(Deque<String> q) {
		Iterator<String> et = q.iterator();
		while (et.hasNext()) {
			System.out.println(et.next());
		}
		return null;	
	}

}
