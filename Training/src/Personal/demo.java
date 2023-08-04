package Personal;

import java.util.LinkedHashSet;

public class demo {

	public static void main(String args[]) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(1);
		lhs.remove(lhs);
		int h = 10;
		String str = "0" + String.valueOf(h);
		System.out.println(str);
		Integer gg = Integer.parseInt(str);
		System.out.println(gg);
	}
}
