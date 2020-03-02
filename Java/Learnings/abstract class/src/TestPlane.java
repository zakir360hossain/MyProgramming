import java.util.Scanner;

public class TestPlane {
    /**
     * Tests the Airplane, CommercialJet, PrivatePlane classes
     * and the Flying interface
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CommercialJet Boeing = new CommercialJet();
		CommercialJet Airbus = new CommercialJet();

		Boeing.setMake("Boeing");

		System.out.println(Airbus);
		System.out.println(Boeing);

		if (Boeing.equals(Airbus))
		{
			 System.out.println("the jets are equal");
		}
		else
		{
			 System.out.println("the jets are NOT equal");
		}


    }
}
