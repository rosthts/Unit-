package list;


import action.Action1;
import action.Action2;

public class ArrayList<Item> implements EditableList<Item> {

    private int size = 0;
    private Object[] array = new Object[10];


    @Override public void remove(int index) {
        if (size == 0) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size-1; i++) {array[i] = array[i+1];}
        size--;
    }

    @Override public void insert(int index, Item item) {
        size++;
        if (size <= array.length) {
            for (int i = size - 2; i >= index; i--) {
                array[i + 1] = array[i];
            }
            array[index] = item;
        }
        else {
            Object[] newArray = new Object[array.length * 2];
            for (int j = 0; j < size; j++) {
                if (j < index) { newArray[j] = array[j]; }
                else if (j > index) {
                    newArray[j] = array [j-1];
                }
            }
            newArray[index] = item;
            array = newArray;
        }


    }

    @Override public Item get(int index) {
        if (size == 0) {
            throw new IndexOutOfBoundsException();
        }
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (Item) array[index];
    }

    @Override public void set(int index, Item item) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        array[index] = item;
    }

    @Override
    public void forEachIndexed(Action2<Integer, Item> action) {
        for (int i = 0; i < size; i++){
            action.run(i, (Item) array[i]);
        }
    }

    @Override public int getSize() {
        return size;
    }
}
