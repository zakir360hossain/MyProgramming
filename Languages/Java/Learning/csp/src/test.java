import java.util.*;

public class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random r = new Random();

		String word = "";
		System.out.println("Enter the topic");
		word = input.nextLine();
		int counter = 1, answerCorrect = 0;
		int a1, a2, a3, b1, b2, b3;

		// Addition-finding the sum of two numbers
		if (word.equalsIgnoreCase("Dot Product") || word.equalsIgnoreCase("DP")) {
			System.out.println("OK!");
			System.out.println("How problems would you like to practice?");
			int problem = input.nextInt();

			while (counter <= problem) {
				a1 = r.nextInt(100 + 1 + 100) - 100;
				a2 = r.nextInt(100 + 1 + 100) - 100;
				a3 = r.nextInt(100 + 1 + 100) - 100;
				b1 = r.nextInt(100 + 1 + 100) - 100;
				b2 = r.nextInt(100 + 1 + 100) - 100;
				b3 = r.nextInt(100 + 1 + 100) - 100;
				double dp = (a1 * b1) + (a2 * b2) + (a3 * b3);//Multiplying the two vectors
				double Magnitude_of_vector1=Math.sqrt(Math.pow(a1,2)+Math.pow(a2,2)+ Math.pow(a3, 2));
				double Magnitude_of_vector2=Math.sqrt(Math.pow(b1,2)+Math.pow(b2,2)+ Math.pow(b3, 2));
				// The angle between the two vectors. It is arccos of the dot product divide by the product of the two magnitude
				double angle=Math.toDegrees(Math.acos((dp)/((Magnitude_of_vector1)*(Magnitude_of_vector2))));
				

				angle=Math.round(angle*100.0)/100.0;
				double answer,angAnsCorr=0;
				System.out.println(angle);
				System.out.println("Question "+counter);
				System.out.println("Find the dot product of the two vectors. Also find the angles betweeen these two vectors.");
				System.out.println( "a = "+ "<"+a1+","+a2+","+ a3+">" +"             "+ "b = "+"<" +b1+","+b2+","+b3+">" );
				System.out.println("The Dot Product:");
				answer=input.nextDouble();
				System.out.println("Angle: ");
				double angle_answer=input.nextDouble();
				
				
				if(answer==dp && angle_answer==angle ){
					System.out.println("Correct!");
					if(dp==0){
						System.out.println("Are the two vectors orthogonal. Y or N");
						word=input.nextLine();
					if(word.equalsIgnoreCase("y")){
						System.out.println("That's Correct!");
					// angAnsCorr=angAnsCorr+ 0.5;
					}
					else if (!word.equalsIgnoreCase("y")){
						System.out.println("Incorrect! Becasue the dot product of the 2 vectors are zero");
					}
					}
					answerCorrect+=2;
				}
				if (answer==dp && angle_answer!=angle ){
					System.out.println("Dot Product: Correct \n" + "Angle; Incorrect");
					answerCorrect++;
				}
				if (answer!=dp && angle_answer==angle ){
					System.out.println("Dot Product: Incorrect \n" + "Angle; Correct");
					answerCorrect++;
				}
				else if (answer!=dp && angle_answer!=angle ){
					System.out.println("Dot Product: Incorrect \n" + "Angle; Incorrect");
				}
			
			
				

				counter = counter + 1;

			}

			// Grade percentage for practicing addition problems
			double percent = (double) (answerCorrect) / (double) (problem*2) * (100);
			percent = Math.round(percent * 100.0) / 100.0;
			System.out.println("your over all grade is " + percent + " %");
		}
	}

}
