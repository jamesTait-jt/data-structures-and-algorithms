import java.util.ArrayList;

public class Graph<T> {
    
    private ArrayList<Node<T>> nodes;
    
    public Graph() {
        this.nodes = new ArrayList<Node<T>>();
    }

    public void addNode(Node<T> node) {
        node.setIndex(nodes.size());
        nodes.add(node);
    }

    public void addEdge(Node<T> a, Node<T> b) {
        if (nodes.contains(a) && nodes.contains(b)) {
            a.addNeighbour(b);
            b.addNeighbour(a);
       }
       else {
           System.out.println("both nodes must be contained in the graph");
       }
    }

    public Node<T> nodeAtIndex(int index) {
        return nodes.get(index);
    }

    public void printGraph(){
        for (Node<T> node : nodes) {
            node.printNode();
        }
    }

    public static void main(String[] args) {
        Graph<String> g = new Graph<String>();
        g.addNode(new Node<String>("hello"));
        g.addNode(new Node<String>("hi"));
        g.addEdge(g.nodeAtIndex(0), g.nodeAtIndex(1));
        g.printGraph();
    }
}
