package ExceptionHandling.java;

public class ExceptionDemo {

	    public void divideNumbers(int a, int b) {
	        try {
	            int result = a / b;  // This can cause ArithmeticException
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Cannot divide by zero!");
	        } finally {
	            System.out.println("Execution of divideNumbers() completed.");
	        }
	    }
	}

