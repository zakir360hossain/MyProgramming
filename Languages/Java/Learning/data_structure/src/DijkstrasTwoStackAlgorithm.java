import java.util.Scanner;
import java.util.Stack;


/**
 * Dijkstra's Two-Stack Algorithm is used to evaluate arithmetic expressions with basic operator
 * <p>
 * Value: push it to the Value stack
 * Operator: push to the Operator stack
 * Left Parenthesis: ignore
 * Right Parenthesis: pop operator and two values; push the result back to the value stack after applying that
 * operator the two values.
 */
public class DijkstrasTwoStackAlgorithm {
    public static void main(String[] args) {
        LinkedStackOfItems<String> operatorStack = new LinkedStackOfItems<>();
        LinkedStackOfItems<Double> valueStack = new LinkedStackOfItems<>();

        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(" ");

        System.out.println(evaluateExpression(tokens, operatorStack, valueStack));
    }

    public static double  evaluateExpression(String[] tokens, LinkedStackOfItems<String> operatorStack,
                                     LinkedStackOfItems<Double> valueStack){
       for (String token : tokens) {
           switch (token) {
               case "(":
                   break;
               case "+":
                   operatorStack.push(token);
                   break;
               case "-":
                   operatorStack.push(token);
                   break;
               case "*":
                   operatorStack.push(token);
                   break;
               case "/":
                   operatorStack.push(token);
                   break;
               case ")":
                   String op = operatorStack.pop();
                   double v = valueStack.pop();
                   if (op.equals("+")) v = valueStack.pop() + v;
                   else if (op.equals("-")) v = valueStack.pop() - v;
                   else if (op.equals("*")) v = valueStack.pop() * v;
                   else if (op.equals("/")) v = valueStack.pop() / v;
                   valueStack.push(v);
                   break;
               default:
                   valueStack.push(Double.valueOf(token));
                   break;
           }
       }
       return valueStack.pop();
   }
}
