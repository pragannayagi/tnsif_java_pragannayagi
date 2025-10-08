package Interface.java;


public class Car implements Vehicle {

	    @Override
	    public void start() {
	        System.out.println("The car has started.");
	    }

	    // We can use the default stop() method from Vehicle directly
	}



