public class Exceptions {

    public static void cannotRemoveFromEmpty() throws RuntimeException {
        throw new RuntimeException("Cannot remove items from an empty linked list.");
    }

    public static void listMustContainNode() throws RuntimeException {
        throw new RuntimeException("Node must be contained in the linked list");
    }

}
