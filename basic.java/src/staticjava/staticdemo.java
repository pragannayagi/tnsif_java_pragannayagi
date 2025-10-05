package staticjava;

public class staticdemo {
	static int count;
	static {
		count=20;
		System.out.println("Show the static count assigned: "+count);
		}
	static void show() {
		System.out.println("method runs in static count:"+count);
	}
    public static void main(String[] args) {
    	System.out.println("static in main method: "+count);
    	show();
    }
}
