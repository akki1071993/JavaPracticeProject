package akash.arrayOperations;

class RotateArray {

	// k = number of rotations
	public void rotate(int nums[], int k) {

		if (nums.length < k) {
			k = k % nums.length; // New k value = 10 % 7 = 3
		}
		int result[] = new int[nums.length]; // create new array with the size of given array
		for (int i = 0; i < k; i++) {
			result[i] = nums[nums.length - k + i];
		}
		int j = 0;
		for (int i = k; i < nums.length; i++) {
			result[i] = nums[j];
			j++;
		}

		System.arraycopy(result, 0, nums, 0, nums.length);

	}

	public static void main(String[] args) {

		RotateArray r = new RotateArray();

		int arr[] = { 15, 92, 3, 84, 14, 56, 70 };

		r.rotate(arr, 253);
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
}