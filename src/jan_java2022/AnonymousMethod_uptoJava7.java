package jan_java2022;

public class AnonymousMethod_uptoJava7 {
	public static void main(String[] args) {
		//Defining an anonymouse method

		//run() methods are wrapped with Runnable.
		//A method can be initialized with this way upto Java7
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Running in Runnable thread");
			}
		};

		r.run();
		System.out.println("running in main method");
	}

}
