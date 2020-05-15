import java.time.Year;

interface Statistic{
    String age(int manufacturedOn);
}

abstract class Motor implements Statistic{
   abstract void doTask1();
   public void doTask2(){
       System.out.println("Method is invoked. Task2 completed!");
   }
    @Override
    public String age(int manufacturedOn) {
        return "Age: " + (Year.now().getValue()-manufacturedOn);
    }
}

// Does not need to re-override age because it is already done in Motor class
class Sedan extends Motor {
     int gear;
     int speed;

    public Sedan(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
    public void speedUp(int increment) {
        speed += increment;
    }
    public String toString() {
        return "Bicycle{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }
    @Override
    void doTask1() {
        System.out.println("Method is invoked. Task1 completed!");
    }
}

class Hardtop extends Sedan {
     int seatHeight;

    public Hardtop(int gear, int speed,
                        int startHeight) {
        super(gear, speed);
        seatHeight = startHeight;
    }
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
    @Override
    public String toString() {
        return (super.toString() +
                "\nseat height is " + seatHeight);
    }
}

public class TypeInteraction {

    public static void main(String[] args) {
        Statistic c1 = new Sedan(34, 45);
        c1.age(1998);

        Motor c2 = new Sedan(35, 56);
        c2.doTask1();
        c2.doTask2();
        c2.age(2000);

        Sedan c3 = new Sedan(43, 54);
        c3.applyBrake(3);
        c3.speedUp(4);
        c3.doTask1();
        c3.doTask2();
        c3.age(2001);
        c3.toString();

        Hardtop c4 = new Hardtop(55, 55, 6);
        c4.applyBrake(7);
        c4.speedUp(9);
        c4.age(2002);
        c4.doTask1();
        c4.doTask2();
        c4.setHeight(8);
        c4.toString();
    }
}
