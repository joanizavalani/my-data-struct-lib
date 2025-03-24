package linkedlist.singly;

public class ListNode<T> {

    // A node has two fields: a field for its value (which is an object) and a pointer to the next node.

    private T value;

    private ListNode<T> next;

    // Two constructors: the first, takes a value & assigns the next node automatically to null,
    // which means there's no other elements after this one unless another one is added.

    public ListNode(T value) {

        this.value = value;
        this.next = null;
    }

    public ListNode(T value, ListNode<T> next) {

        this.value = value;
        this.next = next;
    }

    // Getters & Setters for encapsulation purposes.

    public T getValue() { return this.value; }

    public void setValue(T value) { this.value = value; }

    public ListNode<T> getNext() { return this.next; }

    public void setNext(ListNode<T> next) { this.next = next; }
}