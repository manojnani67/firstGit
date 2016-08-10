package hello;

public class HelloWorld {

	public static void main(String[] args) {

		Greeter greeter=new Greeter();
		System.out.println(greeter.sayHello());
		
		System.out.println(greeter.sayBye());
		
		System.out.println(greeter.thankYou());
		
		System.out.println(greeter.id());
	}

}
