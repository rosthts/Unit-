package set;


import collection.Collection;
import throwables.AlreadyExists;
import throwables.NotExists;


public interface EditableSet<Item> extends Collection<Item> {


    boolean contains (Item item);


    void addOrThrowAlreadyExists (Item item) throws AlreadyExists;

    default void add(Item item) {
        try {
            addOrThrowAlreadyExists(item);
        } catch (AlreadyExists e) {
            throw new RuntimeException(e);
        }
    }


    void removeOrThrowNotExists (Item item) throws NotExists;


}
