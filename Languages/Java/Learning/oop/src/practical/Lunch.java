package practical;

/**
 * @author Zakir Hossain
 * Feb 21, 2020
 * This will be the lunch, which will be a combination of all the foods are from the interface.
 */

public class Lunch {
    private int myTotalCalories;

    public Lunch(){
        myTotalCalories = 0;
    }

    public int getMyTotalCalories() {
        return myTotalCalories;
    }

    public void eat(Edible other, int servings){
        myTotalCalories+=other.getCaloriesPerServing()*servings;
    }
}
