package linkedlist.singly;

public class Demo {

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(-1);
        l1.add(1);
        l1.add(3);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.printList();

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(-2);
        l2.add(0);
        l2.add(5);
        l2.add(10);
        l2.add(12);
        l2.printList();

        LinkedList<Integer> l3 = l1.joinList(l2);
        l3.printList();
    }
}
