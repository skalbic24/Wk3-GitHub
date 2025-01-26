package week3;

public class Methods {

	public static void main(String[] args) {

		//parameter is like a parking spot and argument is like a car
		String firstName = "Bob";
		String lastName = "Ross";
		String fullName = createFullName(firstName, lastName);
		
		System.out.println(fullName);
		
	}
		/*you have to write the instruction and follow in order for the
		method to work. When you write a method you have to call or invoke
		that method like we do right here. You have to actually use it. So
		I can pass anything into there.*/
	public static String createFullName(String x, String y) {
		return x + " " + y;
		
		
	}

}
