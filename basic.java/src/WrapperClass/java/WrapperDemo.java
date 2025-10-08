package WrapperClass.java;

public class WrapperDemo {
	    public static void main(String[] args) {
	        // Primitive int
	        int num = 10;

	        // Boxing
	        Integer obj = num;

	        // Unboxing
	        int n = obj;

	        // Output
	        System.out.println("Primitive int: " + num);
	        System.out.println("Boxed Integer: " + obj);
	        System.out.println("Unboxed int: " + n);
	    }
	}

