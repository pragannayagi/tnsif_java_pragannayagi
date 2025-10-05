package staticjava;

public class finaldemo {
	final int max=100;
	final void display() {
		System.out.println("Show the value of max:" +max);
		}
	public static void main(String[] args) {
		finaldemo fd=new finaldemo();
		fd.display();

	}

}
