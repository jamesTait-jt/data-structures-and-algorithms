public class DLinkedList<T> {

    private DNode<T> first;
   
    
    public DLinkedList() {
        this.first = null;
    }

    /**
     *
     * @param node
     */
    public void append(DNode<T> node) {
        if (first == null) {
            first = node;
        } else {
            DNode<T> curr = first;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            node.setPrev(curr);
            curr.setNext(node);
        }
    }

    /**
     *
     * @param node
     */
    public void removeNode(DNode<T> node) {
        DNode<T> curr = first;
        if (curr == null) {
            throw new MyException("Cannot remove item from empty linked list");
        }
        if (curr.getNext() == null && !curr.equals(node)) {
            throw new MyException("Node must be contained in linked list");
        }
        if (curr.equals(node)) {
            first = curr.getNext();
        } else {
            while (curr.getNext() != node) {
                if (curr.getNext() == null) {
                    throw new MyException("Node must be contained in linked list");
                }
                curr = curr.getNext();
            }
            curr.setNext(node.getNext());
            if (node.getNext() != null) {
                node.getNext().setPrev(curr);
            }
        }
    }

    public void clear() {
        DNode<T> curr = first;
        while (curr != null) {
            removeNode(curr);
            curr = first;
        }
    }

    public void printLinkedList() { 
        DNode<T> curr = first;
        System.out.print("[");
        if (curr == null) {
            System.out.print("]\n");
            return;
        }
        if (curr.getNext() == null) {
            System.out.print(curr.getData());
        }
        else {
            System.out.print(curr.getData() + ", ");
        }
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

     private DNode<T> getLast() {
        if (first == null) {
            return first;
        }
        else {
            DNode<T> curr = first;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            return curr;
        }
    }
    
    private DNode<T> getFirst() {
        return this.first;
    }

    public static void main(String[] args) {
        DLinkedList<Integer> l = new DLinkedList<Integer>();
        for (int i = 0 ; i < 10 ; i++) {
            DNode<Integer> n = new DNode<Integer>(i);
            l.append(n);
        }
        l.printLinkedList();
        l.removeNode(l.getLast());
        l.printLinkedList();
        l.removeNode(l.getLast().getPrev());
        l.printLinkedList();
        l.getLast().getPrev().printNode();
        l.clear();
        l.printLinkedList();
        l.removeNode(l.getFirst());
    }
}
