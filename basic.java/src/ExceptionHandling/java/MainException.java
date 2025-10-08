package ExceptionHandling.java;

public class MainException {
	    public static void main(String[] args) {
	        ExceptionDemo demo = new ExceptionDemo();

	        // Case 1: Normal division
	        demo.divideNumbers(10, 2);

	        // Case 2: Division by zero (exception occurs)
	        demo.divideNumbers(10, 0);
	    }
	}


