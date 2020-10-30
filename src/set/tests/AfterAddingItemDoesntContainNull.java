package set.tests;


import set.EditableSet;
import throwables.AlreadyExists;
import throwables.NotExists;


abstract class AfterAddingItemDoesntContainNull {


    abstract EditableSet<Object> initEditableSet();


    void run() throws NotExists {

        EditableSet<Object> editableSet = initEditableSet();

        Object item = new Object();

        try {
            editableSet.addOrThrowAlreadyExists(item);
        } catch (AlreadyExists alreadyExists) {
            assert false;
        }

        assert !editableSet.contains(null);

    }


}
