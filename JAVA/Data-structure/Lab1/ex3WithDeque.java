
import java.util.ArrayDeque;
import java.util.Deque;

public class ex3WithDeque {
    public static void main(String[] args) {
        String input = "world";
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : input.toCharArray()) {
            deque.push(ch);
        }

        StringBuilder reversed = new StringBuilder();
        while (!deque.isEmpty()) {
            reversed.append(deque.pop());
        }

        System.out.println("Reversed string: " + reversed);
    }
}
