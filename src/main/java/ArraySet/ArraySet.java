package ArraySet;

import java.util.ArrayList;

public class ArraySet<E> implements SimpleSet<E> {
    private ArrayList<E> arrayList;

    public ArraySet() {
        this.arrayList = new ArrayList<>();
    }

    @Override
    public boolean add(E x) {
        if (!arrayList.contains(x)){
            arrayList.add(x);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object x) {
        if (arrayList.contains(x)){
            arrayList.remove(x);
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object x) {
        return arrayList.contains(x);
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
