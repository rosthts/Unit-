package set.tests;


import set.EditableSet;
import throwables.AlreadyExists;
import throwables.NotExists;


abstract class RemovingFromEmptySetThrowsNotExists {


    abstract EditableSet<Object> initEditableSet();


    void run() {

        EditableSet<Object> editableSet = initEditableSet();

        try {
            editableSet.removeOrThrowNotExists(new Object());
            assert false;
        } catch (NotExists e) {}

    }


}
