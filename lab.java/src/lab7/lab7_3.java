package lab7;

import java.util.HashMap;


public class lab7_3 {
	public HashMap<Integer, Integer> getSquares(int[] arr) {
		HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
		for (int number : arr) {
			result.put(number, (int)Math.pow(number, 2));
		}
		return result;
	}
	
	public static void main(String[] args) {
		lab7_3 ex3 = new lab7_3();
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(ex3.getSquares(arr));
	}
}