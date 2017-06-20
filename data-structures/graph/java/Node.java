import java.util.ArrayList;

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

    public void setIndex(int n) {
        this.index = n;
    }

    public int getIndex() {
        return this.index;
    }

    public void addNeighbour(Node<T> node) {
        this.neighbours.add(node);
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
