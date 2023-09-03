package basics;

public class Exceptions {

public static void main(String[] args) {
		
		System.out.println("");
	}
	public void mustThrow() throws Exception {
		//exception cannot be thrown from main
		//throws declaration is necessary
		//try catch block is another option
		// guide: https://rollbar.com/guides/java/how-to-throw-exceptions-in-java/# 
		throw new Exception();
	}
}
