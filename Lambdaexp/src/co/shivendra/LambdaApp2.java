package co.shivendra;

@FunctionalInterface
interface Cab1{ // when an interface have exaclty one 1 abctract method we can call it as a Functional Interface
	 double bookCab(String source, String destination) ; //by default public abstract void bookCab()
	}

public class LambdaApp2 {
	
	static int svar = 100;
	
	public static void main(String[] args) {
		int instanceVar = 10;
		// TODO Auto-generated method stub
		Cab1 cab = (source, destination)->{
			int localvar = 1000;
			System.out.println("instancevar"+instanceVar);
			System.out.println("static variable"+LambdaApp2.svar);
			System.out.println("localvar"+localvar);
			return 123.45;
		};
	}

}
