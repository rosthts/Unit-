package list;

import action.Action1;
import action.Action2;

@SuppressWarnings("unchecked")
public class LinkedList<Item> implements EditableList<Item> {


    private class Entry {
        Entry next;
        Item item;
    }

    private Entry firstEntry = null;


    @Override
    public void remove(int index) {
        if (firstEntry == null) throw new IndexOutOfBoundsException();
        if (index == 0)
            firstEntry = firstEntry.next;

        else {
            Entry entry = firstEntry;
            int count = 0;
            while (count < index - 1) {
                entry = entry.next;
                count++;
            }
            entry.next = entry.next.next;
        }
    }

    @Override
    public void insert (int index, Item item) {
        if (index < 0) throw new IndexOutOfBoundsException();

        Entry newEntry = new Entry();
        newEntry.item = item;
        if (index == 0) {
            newEntry.next = firstEntry;
            firstEntry = newEntry;
            return;
        }
        Entry entry = firstEntry;
        int count = 0;

        while (count < index - 1) {
            if (entry == null) throw new IndexOutOfBoundsException();
            entry = entry.next;
            count++;
        }
        newEntry.next = entry.next;
        entry.next = newEntry;

    }





    @Override
    public Item get(int index) {
        if (firstEntry == null || index < 0 || index >= getSize()) throw new IndexOutOfBoundsException();
        Entry entry = firstEntry;
        int count = 0;
        while (count < index) {
            entry = entry.next;
            count++;
        }
        return entry.item;



    }

    @Override
    public void set(int index, Item item) {
        if (getSize() == 0 || index >= getSize() || index < 0) throw new IndexOutOfBoundsException();
        Entry entry = firstEntry;
        int count = 0;
        while (count < index) {
            entry = entry.next;
            count++;
        }
        entry.item = item;


    }

    @Override
    public int getSize() {
        Entry entry = firstEntry;
        int count = 0;
        while (entry != null) {
            entry = entry.next;
            count++;
        }
        return count;
    }

    @Override
    public void forEachIndexed(Action2<Integer, Item> action) {
        Entry entry = firstEntry;
        int i = 0;
        while (entry != null) {
            action.run(i, (Item) entry);
            entry = entry.next;
            i++;
        }
    }

}
