package week3;

public class GitHub {

	public static void main(String[] args) {
		
		String studentName1 = "Audi";
		String studentName2 = "Tokyo";
		String studentName3 = "Sonny";
		
		System.out.println(studentName1);
		System.out.println(studentName2);
		System.out.println(studentName3);
		
		/* variable type, square brackets is array, identifier, assign operator, when we are
		creating an array, we have to use the new keyword 'cause we're gonna create a new
		instance of the array, then we use the same verbiage that we used at the beginning.
		So new String then you put the number of elements inside the square bracket that 
		are going to exist in the array.*/
		System.out.println("The Array");
		String[] students = new String[3];
		
		students[0] = "Audi";
		students[1] = "Tokyo";
		students[2] = "Sonny";
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		
		// This way we dont have to keep writing system.out for each student
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		System.out.println("Enhanced for loop: ");
		
		for (String student : students) {
			System.out.println(student);
		}
		
		String[] products = new String[5];
		
		products[0] = "Apples";
		products[1] = "Eggs";
		products[2] = "Milk";
		products[3] = "Cereal";
		products[4] = "Water";
		
		for (String product : products) {
			System.out.println("Product: " + product);
		}
		
		int[] multiplesOf3 = new int[10];
		
		for  (int i = 1; i <= multiplesOf3.length; i++) {
				multiplesOf3[i-1] = i * 3;
		System.out.println("number: " + multiplesOf3[i-1]);
		}
		
		int[] multiplesOf5 = new int[10];
		
		for (int i = 0; i < multiplesOf5.length; i++) {
			multiplesOf5[i] = (i + 1) * 5;
			System.out.println(multiplesOf5[i]);
		}
}
}
