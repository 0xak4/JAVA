
import java.util.LinkedList;

public class ex1{
    public static void main(String[] args){
        LinkedList<String> pl_list = new LinkedList<>();
        pl_list.add("PHP");
        pl_list.add("C");
        pl_list.add("Java");
        
        System.out.println("Given linked list: " + pl_list);
        
        // Insert "C++" at position 3.
        pl_list.add(2, "C++");
        // Insert "Python" at the beginning.
        pl_list.offerFirst("Python");
        // Insert "Ruby" at the end.
        pl_list.offerLast("Ruby");
        
        System.out.println("Modified linked list: " + pl_list);
    }
}