package practical;

/**
 * @author Zakir Hossain
 * Feb 21, 2020
 * This will be the breakfast, which will be a combination of all the foods are from the interface.
 */

public class Breakfast {
    private int myTotalCalories;

    public Breakfast(){
        myTotalCalories = 0;
    }

    public int getMyTotalCalories() {
        return myTotalCalories;
    }

    public void eat(Edible other, int servings){
        myTotalCalories+=other.getCaloriesPerServing()*servings;
    }
}
