package recursion;

public class RecursionEx3 {
    public static void main(String[] args) {

        int x = 1, y=1;
        int result;
        result = f(x, y);
        System.out.println(result);

    }
    public static int f(int x, int y){
        if (x>y){
            return (2*x+5*y);
        }
        else if (x<y){
            return ((f(x+2, y-3))+2);
        }
        else {
            return f(x-1, y)-3;
        }
    }
}
