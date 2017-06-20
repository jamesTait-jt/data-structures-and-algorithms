public class SLinkedList<T> {

    private SNode<T> first;
    private int total;

    public SLinkedList() {
        first = null;
        total = 0;
    }

    private SNode<T> getLast()  {
        if (first == null) {
            return first;
        }
        else {
            SNode<T> curr = first;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            return curr;
        }
    }

    private void printLinkedList() {
        SNode<T> curr = first;
        System.out.print("[");
        curr.printNode();
        while (curr.getNext() != null) {
            curr = curr.getNext();
            curr.printNode();
        }
        System.out.print("]\n");
    }

    private void append(T item) {
        SNode<T> node = new SNode<T>(item);
        if (first == null) {
            first = node;
        }
        else {
            getLast().setNext(node);
        }

        total++;
    }
}
