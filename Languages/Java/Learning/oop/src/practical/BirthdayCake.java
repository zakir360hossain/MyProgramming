package practical;

/**
 * @author Zakir Hossain
 * Feb 14, 2020
 * This child practical.BirthdayCake class extends to the parent class practical.Cake.
 * Modifications are being employed to the constructor with additional parameters, and also
 * to the costPerServing method.
 */
public class BirthdayCake extends Cake {
    private int age; // represents the age that would be on the printed on the cake
    private String phrase; //represents the decorative saying on the cake

    public BirthdayCake(int calories, int numServing, double cost, String flavor, int layers,
                        int age, String phrase) {
        super(calories, numServing, cost, flavor, layers);
        this.age = age;
        this.phrase = phrase;
    }
    /*
    This modifies the costPerServing method from the parent class.
    If the phrase is less than 10 characters, $2 will be added.
    If the phrase has between 10 to 20 characters, $3 will be added.
    If the phrase has more than 20 characters, $5 will be added.
    Note: This additional price is for the entire cake, not for per serving
     */
    public double costPerServing(){
        if(phrase.length()<10){
            return super.costPerServing() + 2.0/super.getNumServing();
        }
        else if(phrase.length() <= 20){
            return super.costPerServing() + 3.0/super.getNumServing();
        }
        else {
            return super.costPerServing() + 5.0/super.getNumServing();
        }
    }
    public String toString(){
        return "/Age: "+age + "\nPhrase: "+phrase +super.toString();
    }
}
