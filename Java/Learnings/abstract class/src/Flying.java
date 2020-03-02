public interface Flying {

    /*
    i.	This method updates the current mileage on the Airplane based on
        the current amount of miles driven on the current number of gallons of fuel used.
    ii.	This method should also update tripMiles and fuelUsed.
    iii.The method should return the trips miles per gallon.
 */
    double calcMileage(double miles, double gallons);


    /*
    i.	This method updates and returns the lifetime mileage on the Airplane.
    ii.	This method, when implemented in the concrete classes, should not recreate code from another method.
    iii.This method will calculate the new overall mpg and return it.

    new overall MPG = (overallMiles+miles)/(gallons + (overallMiles+MPG))
     */
    double updateOverallMileage(double miles, double gallons);

}
