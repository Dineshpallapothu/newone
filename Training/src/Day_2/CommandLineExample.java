package Day_2;

public class CommandLineExample {

	public static void main(String[] args) {

		int nums[] = new int[args.length];
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(args[i]);
			if (max < nums[i])
				max = nums[i];
		}

		System.out.println("Largest Element in args: " + max);
	}

}
