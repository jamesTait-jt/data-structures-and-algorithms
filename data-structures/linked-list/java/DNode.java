public class DNode<T> {
    
    private DNode<T> prev;
    private DNode<T> next;
    private T data;
    
    public DNode(T item) {
        this.data = item;
        this.prev = null;
        this.next = null;
    }

    public void printNode() {
        System.out.println("Data: " + data);
        System.out.println("Prev: " + prev);
        System.out.println("Next: " + next);
    }

    public DNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DNode<T> prev) {
        this.prev = prev;
    }

    public DNode<T> getNext() {
        return next;
    }

    public void setNext(DNode<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
