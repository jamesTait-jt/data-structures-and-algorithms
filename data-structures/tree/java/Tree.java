import java.util.ArrayList;

public class Tree<T> {

    private T data;
    private Tree<T> parent;
    private Tree<T> left;
    private Tree<T> right;

    public Tree(T data) {
        this.data = data;
        this.parent  = null;
        this.left = null;
        this.right = null;
    }

    public Tree<T> getLeft() {
        return this.left;
    }

    public void addLeft(T childData) {
        if (left == null) {
            Tree<T> child = new Tree<T>(childData); 
            this.left = child;
            child.setParent(this);
        } else {
            throw new MyException("Child not empty");
        }
    }

    public Tree<T> getRight() {
        return this.right;
    }

    public void addRight(T childData) {
        if (right == null) {
            Tree<T> child = new Tree<T>(childData);
            this.right = child;
            child.setParent(this);
        } else {
            throw new MyException("Child not empty");
        }
    }

    public ArrayList<T> toList() {
        ArrayList<T> ret = new ArrayList<T>();
        ret.add(data);
        if (left != null) {
            ret.addAll(left.toList());
        }
        if (right != null) {
            ret.addAll(right.toList());
        }
        return ret;
    }

    public void printTree() {
        System.out.println(this.toList());
    }

    public Tree<T> getParent() {
        return this.parent;
    }

    public void setParent(Tree<T> parent) {
        this.parent = parent;
    }

    public T getData() {
        return this.data;
    }

    public static void main(String[] args) {
        Tree<Integer> zero = new Tree<Integer>(0);
        zero.printTree();
        zero.addLeft(1);
        zero.printTree();
        zero.addRight(2);
        zero.printTree();
        zero.getLeft().addLeft(3);
        zero.getLeft().addRight(4);
        zero.printTree();
    }

}
