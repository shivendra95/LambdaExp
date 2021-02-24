package co.shivendra;

interface Calculator{
	void add(int num1, int num2);
}

class CalC{
	public static void addsomething(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public void letsAdd(int num1, int num2) {
		System.out.println(num1+num2);
	}
}

interface Messenger{
	Message getMessage(String msg);
}

class Message{
	Message(String msg){
		System.out.println(msg);
	}
}

public class MethodReferencesApp {

	public static void main(String[] args) {
		// TODO Auto-generated2 method stub
		//CalC.addsomething(1, 2);
		
		//1. refrence to a static method
		Calculator cref = CalC::addsomething;
		cref.add(11, 14);
		
		//2. reference to a non static method
		CalC calc = new CalC();
		Calculator cref2 = calc::letsAdd;
		cref2.add(12, 12);
		
		//3. reference to a constructor
		Messenger mref = Message::new;
		mref.getMessage("hello");
		
	}

}
