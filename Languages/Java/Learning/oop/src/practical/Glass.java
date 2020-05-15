package practical;

/**
 * @author Zakir Hossain
 * October 3, 2019
 * 			This program takes information about four glasses and updates them to their current state.
 *
 */

public class Glass {
    private int numOunces;
    private int ounces_in_glass;
    private String hot_or_cold;
    private boolean hasLid;

    // Default Constructors
    public Glass(){
        numOunces = 0;
        ounces_in_glass = 0;
        hot_or_cold = "Unknown";
        hasLid = false;
    }

    // Parameterized Constructors
    public Glass(int num_oz){
        numOunces = num_oz;
        ounces_in_glass = 0;
    }

    // Accessor method
    public int getNumOunces(){
        return numOunces;
    }

    public int getOunces_in_glass(){
        return  ounces_in_glass;
    }
    public String getHot_or_cold(){
       return hot_or_cold;
    }

    public boolean gethasLid(){
        return hasLid=true;

    }


    // Mutator
    public int setOunceInGlass(int ozInGlass){
        ounces_in_glass = ozInGlass;
        return ounces_in_glass;
    }

    public  String setTempState (String hotOrCold){
        hot_or_cold = hotOrCold;
        return hot_or_cold;
    }
    public void drinkFromGlass(int oz_drank){
        if(oz_drank> ounces_in_glass){
            ounces_in_glass = 0;
        }
        else{
            ounces_in_glass = ounces_in_glass - oz_drank;

        }
    }



    public String toString(){
        String data = "";

        data = "  Capacity:                   "+ numOunces +
                "\n  Current liquid volume:      "+ ounces_in_glass +
                "\n  Temperature State:          "+hot_or_cold +
                "\n  Lid's presence:             "+ hasLid;
        return data;
    }


        @Override
        public boolean equals(Object glass)
        {
            /** Two glasses will be equal if:
             *  -their capacity is equal
             *  - both have lids
             *  -the liquid temperature state is the same
             */

            // checking if both the object references are
            // referring to the same object.
            if(this == glass)
                return true;


            if(glass == null || glass.getClass()!= this.getClass())
                return false;

            // type casting of the argument.
            Glass glassclass = (Glass) glass;

            // comparing the state of argument
            return (glassclass.numOunces == this.numOunces && glassclass.ounces_in_glass == this.ounces_in_glass
            && glassclass.hot_or_cold.equals(this.hot_or_cold));
        }


}
