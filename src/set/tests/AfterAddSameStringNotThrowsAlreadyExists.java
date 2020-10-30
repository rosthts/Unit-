package set.tests;


import set.EditableSet;
import throwables.AlreadyExists;
import throwables.NotExists;


abstract class AfterAddSameStringNotThrowsAlreadyExists {


    abstract EditableSet<Object> initEditableSet();


    void run() throws NotExists {

        EditableSet<Object> editableSet = initEditableSet();

        try {
            editableSet.addOrThrowAlreadyExists(new String("a"));
        } catch (AlreadyExists alreadyExists) {
            assert false;
        }

        try {
            editableSet.addOrThrowAlreadyExists(new String("a"));
            assert false;
        } catch (AlreadyExists alreadyExists) {}

    }


}
