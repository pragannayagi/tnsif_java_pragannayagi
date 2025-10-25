
	import java.util.Arrays;

	public class lambdademo {
	    public static void main(String[] args) {
	        String[] names = {"Ravi", "Priya", "Anil"};
	        Arrays.sort(names, (a, b) -> b.compareTo(a)); // Sort in reverse
	        for (String name : names) System.out.println(name);
	    }
	}

