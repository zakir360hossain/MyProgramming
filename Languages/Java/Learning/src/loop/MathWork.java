package loop;

public class MathWork {
    public static void main(String[] args) {
        // part A

        int oddNum=1;

        while (oddNum<=29){
            System.out.print(oddNum + " ");
            oddNum+=2;
        }

        System.out.println("\n");
        int total = 0;
        for (int count = 3; count<=39; count+=3){
            System.out.print(count+ " ");
            total = total+count;
            System.out.print(total);
        }

        int mult45 = 4;
        do {
            if (mult45 % 4 ==0 && mult45 % 5 ==0){
                System.out.println(mult45 + " ");
            }
            mult45+=1;
        }while (mult45 <=100);

        int multiply = 1;

        for (int count = -5; count <=5; count++){
            if (count != 0){
                multiply*=count;
            }
        }
        System.out.println("Prod: "+ multiply);

        int sumPerfect = 0;
        int square = 1;
        while (square <=12){
            int squared = square*square;
            if (squared % 2 ==0) {
                System.out.print(square * square + " ");
                sumPerfect = sumPerfect +squared;
            }
            square++;
        }
        System.out.println("Sum: "+ sumPerfect);
    }
}
