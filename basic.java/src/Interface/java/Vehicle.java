package Interface.java;


public interface Vehicle {
	    // Abstract method
	    void start();

	    // Default method (Java 8 feature)
	    default void stop() {
	        System.out.println("The vehicle has stopped.");
	    }
	}



