package akash.arrayOperations;

import java.util.Arrays;

public class KthSmallestDemo {

	public int kthSmallest(int array[],int k)
	{
		//sort array
		Arrays.sort(array);
		for (int i : array) {
			System.out.println(i);
		}

		return array[k-1];
	}
	
	public static void main(String[] args) {
		
		int nums[]= {10,2,9,16,5,0};
		
		KthSmallestDemo obj= new KthSmallestDemo();
		System.out.println(obj.kthSmallest(nums, 4));
	}
}
