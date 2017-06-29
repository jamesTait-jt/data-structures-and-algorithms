public class MyException extends RuntimeException {

    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }

    //public static void cannotRemoveFromEmpty() {
    //    throw new RuntimeException("Cannot remove items from an empty linked list.");
    //}

    //public static void listMustContainNode() throws RuntimeException {
    //    throw new RuntimeException("Node must be contained in the linked list");
    //}

}
