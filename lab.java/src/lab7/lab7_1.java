package lab7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;



public class lab7_1 {
	public List getValues(HashMap map) {
		List temp = new ArrayList<>(map.values());
		Collections.sort(temp);
		return temp;
	}
	public static void main(String[] args) {
	     lab7_1 ex1 = new lab7_1();
		HashMap hm1 = new HashMap();
		hm1.put("s", 1);
		hm1.put("h", 5);
		hm1.put("a", 2);
		hm1.put("s", 8);
		hm1.put("h", 1);
		hm1.put("i", 9);
		
		System.out.println(ex1.getValues(hm1));
	}
}