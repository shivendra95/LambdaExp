package co.shivendra;

@FunctionalInterface
interface Cab{ // when an interface have exaclty one 1 abctract method we can call it as a Functional Interface
	 double bookCab(String source, String destination) ; //by default public abstract void bookCab()
	}

	/*
	 * class UberX implements Cab{ public void bookCab() {
	 * System.out.println("UberX booked!!"); } }
	 */

public class LambdaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1.
		 * Cab cab = new UberX();// polymorphic method cab.bookCab();
		 */
		
		//2. Anonymous class implementation
		/*
		 * Cab cab = new Cab() {
		 * 
		 * @Override public void bookCab() { System.out.println("UberX booked!!");
		 * 
		 * } }; cab.bookCab();
		 */
		
		//3. Lambda exp -> functional interfaces
		
		Cab cab = (source, destination)->{
			System.out.println("UberX booked from "+source+" to "+ destination);
			return 850.12;
		};
		
		double fare = cab.bookCab("delhi", "gurgaon");
		System.out.println("Fare is "+fare);
	}

}
