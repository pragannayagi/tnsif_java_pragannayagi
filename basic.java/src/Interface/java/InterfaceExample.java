package Interface.java;

public class InterfaceExample {
	    public static void main(String[] args) {
	        Vehicle myCar = new Car();   // Upcasting to interface
	        myCar.start();               // Calls overridden method
	        myCar.stop();                // Calls default method
	    }
	}



