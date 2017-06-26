import java.util.ArrayList;
import java.util.Iterator;
import java.lang.RuntimeException;

public class Node<T> {

    private int index;
    private ArrayList<Node<T>> neighbours;
    private T data;

    public Node(T data) {
        this.data = data;
        this.neighbours = new ArrayList<Node<T>>();
    }

    public void printNode() {
        System.out.print("(" + data + ", " + index + ", ");
        printNeighbours();
        System.out.println(")");
    }

    public void printNeighbours() {
        for (Node<T> node : neighbours) {
            System.out.print("(" + node.getData() + ", "  + node.getIndex() + ")");
        }
    }

    public void clearNeighbours() {
        this.neighbours.clear();
    }

    public void setIndex(int n) {
        this.index = n;
    }

    public int getIndex() {
        return this.index;
    }

    public void addNeighbour(Node<T> node) {
        this.neighbours.add(node);
    }

    public void removeNeighbour(Node<T> node) {
        if (neighbours.contains(node)) {
           for (Iterator<Node<T>> iter = neighbours.listIterator() ; iter.hasNext() ; ) {
                Node<T> a = iter.next();
                if (a.equals(node)) {
                    iter.remove();
                }       
            }
        } else {
            throw new RuntimeException("Node is not a neighbour");
        }
    }

    public ArrayList<Node<T>> getNeighbours() {
        return this.neighbours;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

}
