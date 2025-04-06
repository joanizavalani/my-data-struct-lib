package linkedlist.doubly;

public class DoublyLinkedList<T> {

    private DoublyListNode<T> header;

    private DoublyListNode<T> trailer;

    public DoublyLinkedList() {

        header = new DoublyListNode<>(null);
        trailer = new DoublyListNode<>(null, null, header);
        header.setNext(trailer);
    }

    public void add(T value) {

        DoublyListNode<T> node = new DoublyListNode<>(value);

        node.setPrev(trailer.getPrev());
        trailer.getPrev().setNext(node);
        node.setNext(trailer);
        trailer.setPrev(node);
    }

    public void print() {

        if (header.getNext() == trailer)
            System.out.println("[]");

        else {
            DoublyListNode<T> node = header.getNext();
            System.out.print("[");

            while (node.getNext() != trailer) {

                System.out.print(node.getValue() + ", ");
                node = node.getNext();
            }
            System.out.println(node.getValue() + "]");
        }
    }
}
