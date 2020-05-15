package practical;

/**
 * @author Zakir Hossain
 * March 2, 2020
 * This is the main method to test the practical.Airplane and its two child classes, practical.CommercialJet and practical.PrivatePlane.
 */
public class TestPlane {
    /**
     * Tests the practical.Airplane, practical.CommercialJet, practical.PrivatePlane classes
     * and the practical.Flying interface
     */
    public static void main(String[] args) {


		// practical.CommercialJet objects
        CommercialJet Boeing = new CommercialJet(12, 500000, 100, 500000, 122,
						"Boeing", 2000, 900, 60);
        CommercialJet Turbojet_engine = new CommercialJet(29, 600000, 286, 550000, 269, "Turbojet Engine", 3070,
				1300, 38);

        // practical.PrivatePlane objects
		PrivatePlane Airbus = new PrivatePlane(15, 2100000, 120, 2100000, 189,
				"Airbus", 1500, 700, 40, 168);
		PrivatePlane Lockheed = new PrivatePlane(19, 700000, 200, 700000, 190,
				"Lockheed", 1450, 1100, 41, 208);

		System.out.println("The Boeing (Commercial Jet):\n"+Boeing+"\n\n");
		System.out.println("The Turbojet Engine (Commercial Jet):\n"+Boeing+"\n\n");
		System.out.println("The Airbus (Private Jet):\n"+ Airbus+"\n\n");
		System.out.println("The Lockheed (Private Jet):\n"+ Airbus+"\n\n");

		// The values of both planes are being updated, the newValue will be constant because it is the price when
		// it was bought in the first place.
		Boeing.airplaneValue();
		System.out.println("Value of Boeing after the update: "+ Boeing.getValue()+"\n");

		Airbus.airplaneValue();
		System.out.println("Value of Airbus after the update: "+ Airbus.getValue()+"\n");

		//calcMileage method is being called. MPG, tripMiles, fuelUsed, etc., will be updated
		// New MPGs will be printed.
		System.out.println("New Mileage of Boeing: "+Boeing.calcMileage(270, 3));
		System.out.println("The trip miles for Boeing"+Boeing.getTripMiles());
		System.out.println("Fuel used for the Boeing trip"+Boeing.getFuelUsed()+"\n");

		System.out.println("New Mileage of Airbus: "+Airbus.calcMileage(290, 4));
		System.out.println("The trip miles for Airbus"+Airbus.getFuelUsed());
		System.out.println("Fuel used for the Airbus trip"+Airbus.getTripMiles()+"\n");


		//updateOverallMileage method is being invoked in here
		// The new overall mileage (MPG) is printed
		System.out.println("The new overall mileage of Boeing: "+Boeing.updateOverallMileage(1209, 39)+"\n");
		System.out.println("The new overall mileage of Airbus: "+Airbus.updateOverallMileage(1390, 31)+"\n");


		//equals method is being invoked
		if (Boeing.equals(Turbojet_engine))
		{
			 System.out.println("The jets are equal");
		}
		else
		{
			 System.out.println("The jets are NOT equal");
		}

		if(Airbus.equals(Lockheed)){
			 System.out.println("The planes are equal");
		}
		else {
			System.out.println("The planes are NOT equal");
		}

		// Comparison method is being invoked.
		System.out.println(Boeing.compareTo(Turbojet_engine));
		System.out.println(Airbus.compareTo(Lockheed));


    }
}
