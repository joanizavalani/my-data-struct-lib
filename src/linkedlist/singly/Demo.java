package linkedlist.singly;

public class Demo {

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        ListIterator<Integer> itr1 = new ListIterator<>(l1.getHeader());

        l1.add(1, itr1);
        l1.add(2, itr1);
        l1.add(3, itr1);
        l1.add(4, itr1);
        l1.printList();
    }
}
