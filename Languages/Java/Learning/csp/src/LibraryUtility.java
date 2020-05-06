import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LibraryUtility {

	public static Boolean isOverdue(Integer durationEntered, Integer bookMaxDuration) {
		if (durationEntered > bookMaxDuration) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}
	
	public static void test(Integer durationEntered, Integer bookMaxDuration) {
		
		int i = 0;
		Integer iInt = null;
		Object o = null;
	}

	public static void main(String[] args) {

		HashMap<String, Integer> bookMap = new HashMap<String, Integer>();
		bookMap.put("Book1", 31);
		bookMap.put("Book2", 28);
		bookMap.put("Book3", 40);
		bookMap.put("Book4", 13);

		Boolean breakout = Boolean.FALSE;
		while (!breakout) {
			System.out.println("Enter the book you are interested in (Enter X to exit): " + bookMap.toString());

			// enter the book your interested in
			Scanner scanner = new Scanner(System.in);
			String inputBook = scanner.nextLine();
			if (inputBook.equalsIgnoreCase("X")){
				scanner.close();
				System.out.println("Goodbye!");
				return;
			}
			
			System.out.println("You entered string " + inputBook);
			if (!bookMap.containsKey(inputBook.trim())) {
				System.out.println(inputBook + " is not in the list, try again!");
			} else {
				// how many days have you had the book?
				System.out.println("How many days have you had " + inputBook + "?");
				Integer inputDays = scanner.nextInt();
				System.out.println("You entered integer " + inputDays);

				// print overdue or not overdue, if overdue, what is the cost

				Integer overdueDays = inputDays - bookMap.get(inputBook);
				if (overdueDays >= 0) {
					// print cost
					System.out.println(
							"You owe: " + 1.02 * overdueDays + " since you are " + overdueDays + " days overdue.");
				} else {
					System.out.println(
							"You have: " + -1 * overdueDays + " days remaining.");
					
				}
				//scanner.close();  Don't close the scanner!
			}
		}
	} // end loop

}