package ArraySet;

public class ArraySet<E> implements SimpleSet<E> {
    @Override
    public boolean add(E x) {
        return false;
    }

    @Override
    public boolean remove(Object x) {
        return false;
    }

    @Override
    public boolean contains(Object x) {
        return false;
    }

    @Override
    public E get(int pos) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
