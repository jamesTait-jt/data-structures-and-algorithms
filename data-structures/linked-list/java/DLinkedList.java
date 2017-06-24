public class DLinkedList<T> {

    private DNode<T> first;
    
    public DLinkedList() {
        this.first = null;
    }

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

    public void printLinkedList() { 
        DNode<T> curr = first;
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

    public static void main(String[] args) {
        DLinkedList<Integer> l = new DLinkedList<Integer>();
        for (int i = 0 ; i < 10 ; i++) {
            DNode<Integer> n = new DNode<Integer>(i);
            } else {
            l.append(n);
        }
        l.printLinkedList();
    }
}
