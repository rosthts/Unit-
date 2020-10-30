package set;


import action.Action1;
import throwables.AlreadyExists;
import throwables.NotExists;


public interface EditableSet<Item> {


    int getSize();

    default boolean isEmpty() {
        return getSize() == 0;
    }


    boolean contains (Item item);


    void forEach (Action1<Item> action);


    void addOrThrowAlreadyExists (Item item) throws AlreadyExists;


    void removeOrThrowNotExists (Item item) throws NotExists;


}
