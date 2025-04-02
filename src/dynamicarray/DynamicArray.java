package dynamicarray;

public class DynamicArray<T extends Comparable<T>> {

    private T[] array;

    private int size;

    private int capacity;

    @SuppressWarnings("unchecked")
    public DynamicArray() {

        this.capacity = 10;
        this.size = 0;
        this.array = (T[]) new Comparable[capacity];
    }

    @SuppressWarnings("unchecked")
    private void increaseCapacity() {

        T[] original = array;
        capacity += capacity / 2;
        array = (T[]) new Comparable[capacity];

        for (int i = 0; i < size; i++)
            array[i] = original[i];

        original = null;
    }

    public int capacity() {

        return this.capacity;
    }

    public int size() {

        return this.size;
    }

    public void add(T value) {

        if (size >= capacity - 1)
            increaseCapacity();

        array[size] = value;
        size++;
    }

    public void remove(int index) {

        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index out of array bounds.");

        for (int i = 0; i < size - 1; i++)
            array[i] = array[i + 1];

        array[size - 1] = null;
        size--;
    }

    public T atIndex(int index) {

        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index out of array bounds.");

        return array[index];
    }

    public void replace(int index, T value) {

        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index out of array bounds!");

        array[index] = value;
    }

    public void print() {

        int i;
        for (i = 0; i < size - 1; i++) {

            System.out.print(array[i] + ", ");
        }
        System.out.println(array[i]);
    }

    public void sort() {

        T temp;
        boolean swapped;

        do {
            swapped = false;

            for (int i = 0; i < size - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {

                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    swapped = true;
                }
            }
        } while (swapped);
    }
}