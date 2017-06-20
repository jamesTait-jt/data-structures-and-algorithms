import java.util.ArrayList;

public class Util {

    public static <T> int getSmallestAvailableIndex(Graph<T> g) {
        ArrayList<Integer> indexList = new ArrayList<Integer>();
        for (Node<T> node : g.getNodes()) {
            indexList.add(node.getIndex());
        }
        for (int i = 0 ; i < indexList.size() - 1 ; i++) {
            if (indexList.get(i + 1) - indexList.get(i) > 1) {
                System.out.println("hit");
                return indexList.get(i) + 1;
            }
        }
        return indexList.size();
    }

    public static <T> void test() {
        Graph<String> g = new Graph<String>();
        
        Node<String> n0  = new Node<String>("Zero");
        Node<String> n1  = new Node<String>("One");
        Node<String> n2  = new Node<String>("Two");
        Node<String> n3  = new Node<String>("Three");
        Node<String> n4  = new Node<String>("Four");
        Node<String> n5  = new Node<String>("Five");
        Node<String> n6  = new Node<String>("Six");
        Node<String> n7  = new Node<String>("Seven");
        Node<String> n8  = new Node<String>("Eight");
        Node<String> n9  = new Node<String>("Nine");

        g.addNode(n0);
        g.addNode(n1);
        g.addNode(n2);
        g.addNode(n3);
        g.addNode(n4);
        g.addNode(n5);
        g.addNode(n6);
        g.addNode(n7);
        g.addNode(n8);
        g.addNode(n9);

        g.printGraph();

        g.addEdge(g.nodeAtIndex(0), g.nodeAtIndex(1));
        g.addEdge(g.nodeAtIndex(0), g.nodeAtIndex(2));
        
        g.printGraph();

        g.removeNode(n1);
        
        g.printGraph();

        g.addNode(n1);

        g.printGraph();

        g.removeEdge(n0, n2);

        g.printGraph();
    }
}
