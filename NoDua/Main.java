import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Deque;

public class Main {
  public static void main(String[] args) {
    // Program sederhana ArrayList dan ArrayDeque
    List<String> list = new ArrayList<>();
    Deque<Integer> deque = new ArrayDeque<>();

    list.add("Teks 1");
    list.add("Teks 2");
    list.add("Teks 3");
    list.remove("Teks 2");

    deque.add(10);
    deque.add(20);
    deque.add(30);
    deque.remove();

    System.out.println(list);
    System.out.println(deque);
  }
}
