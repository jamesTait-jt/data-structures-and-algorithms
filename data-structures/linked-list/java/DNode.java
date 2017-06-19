public class DNode<T> extends SNode<T> {
    
    private DNode<T> prev;
    private DNode<T> next;
    private T data;
    
    private DNode(T item) {
        super(item);
    }

    public DNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DNode<T> prev) {
        this.prev = prev;
    }

    @Override
    public DNode<T> getNext() {
        return next;
    }

    public void setNext(DNode<T> next) {
        this.next = next;
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }
}
