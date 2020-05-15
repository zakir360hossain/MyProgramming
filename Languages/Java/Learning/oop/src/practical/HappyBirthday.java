package practical;

/**
 * Contains an array of Balloons:
 * Some will be Birthday practical.Balloon
 * some will be Round practical.Balloon
 * Some will be square balloon
 */
public class HappyBirthday {
    private Balloon[] partyBalloons;
    private String saying;

    /*
    @param number- number of balloon purchased
    @param saying -  takes a birthday wishing phrase, like Celebrate!
     */
    public HappyBirthday(int number, String color, int age, String saying){
        partyBalloons = new Balloon[number];
        this.saying = saying;

        /*
        1st balloon is Birthday balloon, and the remaining balloons will be either a round or square balloon
         */
        //Instantiate each balloon separately
        partyBalloons[0] = new BirthdayBalloon(color, 5.50, 8, age);
        partyBalloons[1] = new CelebrateBalloon(color, 1.99, 3, 4, "MickyMouse", saying);
        partyBalloons[2] = new ShapeBalloon(color, 2.89, 5, 2, "Cinderella");

        // The rest of the balloon will be type of child classes Roundclass and SquareClass.
        for (int i = 3; i<partyBalloons.length; i++){
            //if the i is even, then round
            //else square balloon
            if(i%2==0){
                partyBalloons[i] = new RoundBalloon(color, 2.25, 3);
            }
            else {
                partyBalloons[i] = new SquareBalloon(color, 2.25 , 3);
            }
        }

    }
    public Balloon [] getPartyBalloons(){
        return partyBalloons;
    }

    public String toString(){
        return "Saying: "+saying;
    }
}
