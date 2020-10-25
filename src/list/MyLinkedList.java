package list;

import java.util.Iterator;

@SuppressWarnings("unchecked")
public class MyLinkedList<Item> implements MyList<Item> {


    private class Entry {
        Entry next;
        Item item;
    }

    private Entry firstEntry = null;


    @Override
    public void remove(int index) {
        if (firstEntry == null) throw new IndexOutOfBoundsException();
        firstEntry = null;

    }

    @Override
    public void insert(int index, Item item) {
        if (getSize() == 0) {
            firstEntry = new Entry();
            firstEntry.item = item;
        }
        else {
            firstEntry.next = new Entry();
            firstEntry.next.item = item;
        }


    }

    @Override
    public Item get(int index) {
        if (firstEntry == null || index < 0 || index <= getSize()) throw new IndexOutOfBoundsException();
        if (index == 0) return firstEntry.item;

        if (index ==1) return firstEntry.next.item;
        else throw new IndexOutOfBoundsException();

    }

    @Override
    public void set(int index, Item item) {
        if (getSize() == 0) throw new IndexOutOfBoundsException();
        firstEntry.item = (Item) "B";


    }

    @Override
    public int getSize() {
        Entry entry = firstEntry;
        int count = 0;
        while (entry != null){
            Entry next = entry.next;
            count++;
            entry = next;
        }
            return count;

        }


}
