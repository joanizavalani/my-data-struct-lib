package linkedlist.singly;

public class LinkedList<T> {

    // A singly-linked list has a header, which for the programmer on the other end is hidden from him,
    // which is why it has a null value. The first element (index = 0) of the list is the node that
    // comes after the header. This is why the constructors automatically assign the header's value to null.
    // This makes processes such as addition before the first "usable" node possible.

    private final ListNode<T> header;

    public LinkedList() {

        this.header = new ListNode<>(null);
    }

    public ListNode<T> getHeader() { return this.header; }

    // Methods:

    public void add(T value, ListIterator<T> itr) {

        if (itr != null && itr.getCurrent() != null) {
            itr.getCurrent().setNext(new ListNode<>(value, itr.getCurrent().getNext()));
            itr.advance();
        }
    }

    public boolean isEmpty() {

        return header.getNext() == null;
    }

    public void printList() {

        if (isEmpty()) {
            System.out.println("This list is empty!");
        } else {
            ListNode<T> node = header.getNext();

            while (node.getNext() != null) {
                System.out.print(node.getValue() + ", ");
                node = node.getNext();
            }
            System.out.println(node.getValue());
        }
    }
}