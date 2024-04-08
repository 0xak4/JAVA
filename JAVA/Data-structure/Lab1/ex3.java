package Lab1;
import java.util.Stack;

public class ex3 {
    public static void main(String[] args) {
        String input = "hello";
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        System.out.println("Reversed string: " + reversed);
    }
}
