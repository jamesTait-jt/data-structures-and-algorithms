
import java.util.ArrayList;
import java.lang.RuntimeException;

public class Stack<T> {

    private ArrayList<T> arr;
    private int total;

    public Stack() {
        arr = new ArrayList<T>();
        total = 0;
    }

    private void push(T x) {
        arr.add(x);
        total++;
    }

    private void pop() {
        if (arr.size() > 0) { 
            arr.remove(arr.size() - 1);
            total --;
        }
        else {
          throw new RuntimeException("Cannot pop from empty stack");
        }
    }

    private void multiPush(ArrayList<T> xs) {
        arr.addAll(xs);
        total += xs.size();
    }

    private void multiPop(int n) {
        if (arr.size() > 0 && n <= arr.size()) {
            while (n > 0) {
                pop();
                n--;
            }
        }
    }

}
