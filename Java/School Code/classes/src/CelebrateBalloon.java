public class CelebrateBalloon extends SquareBalloon {
    private String saying;
    public CelebrateBalloon() {
    }

    public CelebrateBalloon(String color, double price, int SideLength, String saying) {
        super(color, price, SideLength);
        this.saying = saying;
    }
}
