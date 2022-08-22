package lab5;
import java.util.HashMap;

public class lab5_2 {


	
	public long Fibonacci(int n, HashMap<Integer, Long> know) {
		if (know.containsKey(n)){
			return know.get(n);
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 1;
		}
		long t = Fibonacci(n - 1, know) + Fibonacci(n - 2, know);
		know.put(n, t);
		return t;
	}
	
	public long non_recursive_Fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		long a = 1;
		long b = 1;
		long c = 0;
		for (int i=0; i<n - 2; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
	
	public static void main(String[] args) {
		lab5_2 s = new lab5_2();
		System.out.println(s.Fibonacci(20, new HashMap<>()));
		System.out.println(s.non_recursive_Fibonacci(25));
	}

}

