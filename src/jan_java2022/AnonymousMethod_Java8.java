package jan_java2022;

public class AnonymousMethod_Java8 {


	public static void main(String[] args) {
		//lambda expression
		Runnable r = () -> System.out.println("Running in runnable method");

		r.run();

		System.out.println("Running in main thread");
	}
}
