public class SLinkedList<T> {

    private SNode<T> first;

    public SLinkedList() {
        first = null;
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
        if (curr == null) {
            System.out.print("]\n");
            return;
        }
        System.out.print(curr.getData() + ", ");
        while (curr.getNext() != null) {
            curr = curr.getNext();
            if (curr.getNext() == null) {
                System.out.print(curr.getData());
            } else {
                System.out.print(curr.getData() + ", ");
            }
        }
        System.out.print("]\n");
    }

    private void append(SNode<T> node) {
        if (first == null) {
            first = node;
        }
        else {
            getLast().setNext(node);
        }
    }

    private void removeNode(SNode<T> node) {
        SNode<T> curr = first;
        if (curr == null) {
            throw new RuntimeException("Cannot remove from empty linked list");
        }
            //} else if (curr == node) {
        //    first = curr.getNext();
        }
        if (curr.getNext() == null && curr != node) {
            throw new RuntimeException("Node must be in the linked list");
        }
        if (curr == node) {
            first = curr.getNext();
        } else {
            while (curr.getNext() != node) {
                if (curr.getNext() == null) {
                    throw new RuntimeException("Node must be in the linked list");
                }
                curr = curr.getNext();
            }
            curr.setNext(node.getNext());
        }
    }

    public void clear() {
    }

    public SNode<T> getFirst() {
        return this.first;
    }

    public static void main(String[] args) {
        SLinkedList<Integer> l = new SLinkedList<Integer>();
        for (int i = 0 ; i < 10 ; i++) {
            SNode<Integer> n = new SNode<Integer>(i); 
            l.append(n);
        }
        l.printLinkedList();
        l.removeNode(l.getLast());
        l.printLinkedList();
        l.removeNode(l.getFirst().getNext());
        l.printLinkedList();
    }
}
