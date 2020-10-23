package list;

public interface MyList<Item> {

    void remove(int index);
    void insert (int index, Item item);
    Item get (int index);
    void set (int index, Item item);
    int getSize ();

    default void add(Item item) {
        insert(getSize(), item);
    }

    default boolean isEmpty() {
        return getSize() == 0;
    }

}
