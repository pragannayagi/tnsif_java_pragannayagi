package oops_abstraction;

public class AbstractDemo {


		public static void main(String[] args) {
			square sq=new square();
			Rectangle r1=new Rectangle();
			sq.calArea();
			sq.show();
			r1.calArea();
			r1.show();
			
			System.out.println("------------------------------------------------");
			
			shape shape;
			shape=new square(12.5f);
			
			shape.calArea();
			shape.show();
			
			shape=new Rectangle(10,20);
			
			shape.calArea();
			shape.show();

		}

	}


