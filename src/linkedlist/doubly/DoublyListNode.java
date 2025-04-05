package linkedlist.doubly;

public class DoublyListNode<T> {

    private T value;

    private DoublyListNode<T> next;

    private DoublyListNode<T> prev;

    public DoublyListNode(T value) {

        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public DoublyListNode(T value, DoublyListNode<T> next, DoublyListNode<T> prev) {

        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public T getValue() { return value; }

    public void setValue(T value) { this.value = value; }

    public DoublyListNode<T> getNext() { return next; }

    public void setNext(DoublyListNode<T> next) { this.next = next; }

    public DoublyListNode<T> getPrev() { return prev; }

    public void setPrev(DoublyListNode<T> prev) { this.prev = prev; }
}