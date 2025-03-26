package linkedlist.singly;

public class LinkedList<T extends Comparable<T>> {

    // A singly-linked list has a header, which for the programmer on the other end is hidden from him,
    // which is why it has a null value. The first element (index = 0) of the list is the node that
    // comes after the header. This is why the constructors automatically assign the header's value to null.
    // This makes processes such as addition before the first "usable" node possible.

    private ListNode<T> header;

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

    public void add(T value) {

        ListNode<T> node = header;

        while (node.getNext() != null)
            node = node.getNext();

        node.setNext(new ListNode<>(value, null));
    }

    public void remove(T value) {

        ListNode<T> node = header.getNext();

        while (node != null && !node.getNext().getValue().equals(value))
            node = node.getNext();

        node.setNext(node.getNext().getNext());
    }

    public int size() {

        int count = 0;
        ListNode<T> node = header;

        while (node.getNext() != null) {
            count++;
            node = node.getNext();
        }
        return count;
    }

    public boolean isEmpty() {

        return header.getNext() == null;
    }

    public void makeEmpty() {

        header.setNext(null);
    }

    public LinkedList<T> joinList(LinkedList<T> list2) {

        ListNode<T> node1 = header.getNext();
        ListNode<T> node2 = list2.header.getNext();

        if (isEmpty() || list2.isEmpty()) {
            return null;
        }

        LinkedList<T> list3 = new LinkedList<>();

        while (node1 != null && node2 != null) {

            if (node1.getValue().compareTo(node2.getValue()) < 0) {
                list3.add(node1.getValue());
                node1 = node1.getNext();
            } else {
                list3.add(node2.getValue());
                node2 = node2.getNext();
            }
        }

        while (node1 != null) {
            list3.add(node1.getValue());
            node1 = node1.getNext();
        }

        while (node2 != null) {
            list3.add(node2.getValue());
            node2 = node2.getNext();
        }
        return list3;
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