package MarkerInterface;

public class MainMarker {
	    public static void main(String[] args) {
	        Student s = new Student();
	        if (s instanceof Marker) {
	            System.out.println("Student is marked using Marker interface.");
	        } else {
	            System.out.println("Not marked.");
	        }
	    }
	}



