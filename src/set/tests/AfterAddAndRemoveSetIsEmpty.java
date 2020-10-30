package set.tests;


import set.EditableSet;
import throwables.AlreadyExists;
import throwables.NotExists;


abstract class AfterAddAndRemoveSetIsEmpty {


    abstract EditableSet<Object> initEditableSet();


    void run() throws NotExists {

        EditableSet<Object> editableSet = initEditableSet();

        Object item = new Object();

        try {
            editableSet.addOrThrowAlreadyExists(item);
        } catch (AlreadyExists alreadyExists) {
            assert false;
        }

        try {
            editableSet.removeOrThrowNotExists(item);
        } catch (NotExists e) {
            assert false;
        }

        assert editableSet.getSize() == 0;

    }


}
