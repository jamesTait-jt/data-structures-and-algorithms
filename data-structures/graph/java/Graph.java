import java.util.ArrayList;
import java.util.Iterator;

public class Graph<T> {
    
    private ArrayList<Node<T>> nodes;
    
    public Graph() {
        this.nodes = new ArrayList<Node<T>>();
    }

    public Boolean adjacent(Node<T> a, Node<T> b) {
        return (a.getNeighbours().contains(b) && b.getNeighbours().contains(a));
    }


    public void addNode(Node<T> node) {
        node.setIndex(Util.getSmallestAvailableIndex(this));
        nodes.add(node);
    }

    public void removeNode(Node<T> node) {
        if (nodes.contains(node)) {
            for (Iterator<Node<T>> iter = nodes.listIterator() ; iter.hasNext() ; ) {
                Node<T> a = iter.next();
                if (a.getIndex() == node.getIndex()) {
                    iter.remove();
                }       
            }
            for (Node<T> neighbour : node.getNeighbours()) {
                neighbour.removeNeighbour(node);
            }
            node.clearNeighbours();
        }
    }

    public void addEdge(Node<T> a, Node<T> b) {
        if (nodes.contains(a) && nodes.contains(b)) {
            if (!adjacent(a, b)) {
                a.addNeighbour(b);
                b.addNeighbour(a);
            } else {
                throw new MyException("Only one edge permitted between two nodes");
            }
       } else {
           throw new MyException("Both nodes must be contained in the graph");
       }
    }

    public void removeEdge(Node<T> a, Node<T> b) {
        a.removeNeighbour(b);
        b.removeNeighbour(a);
    }

    public Node<T> nodeAtIndex(int index) {
        return nodes.get(index);
    }

    public void printGraph(){
        System.out.println("--------");
        for (Node<T> node : nodes) {
            node.printNode();
        }
        System.out.println("--------");
    }

    public ArrayList<Node<T>> getNodes() {
        return this.nodes;
    }

    public static void main(String[] args) {
        Util.test();        
    }
}
