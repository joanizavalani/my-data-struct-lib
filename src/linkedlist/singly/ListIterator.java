package linkedlist.singly;

public class ListIterator<T> {

    // An iterator will help us iterate thought the linked nodes of a linked list.
    // It has a single field; the current node of its iteration.

    private ListNode<T> current;

    // A constructor which takes as a parameter the current node we want to iterate

    public ListIterator(ListNode<T> current) {

        this.current = current;
    }

    // Getters & Setters for encapsulation purposes.

    public ListNode<T> getCurrent() { return this.current; }

    public void setCurrent(ListNode<T> current) { this.current = current; }

    // Methods:

    public boolean isValid() {

        return this.current != null;
    }

    public T retrieve() {

        if (isValid())
            return current.getValue();
        else
            return null;
    }

    public void advance() {

        if (isValid())
            current = current.getNext();
    }
}