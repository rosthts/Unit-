package set.tests;


import set.EditableSet;
import throwables.AlreadyExists;
import throwables.NotExists;


abstract class AfterAddAAndRemoveBThrowsException {


    abstract EditableSet<Object> initEditableSet();


    void run() throws NotExists {

        EditableSet<Object> editableSet = initEditableSet();

        Object a = new Object();
        Object b = new Object();

        try {
            editableSet.addOrThrowAlreadyExists(a);
        } catch (AlreadyExists alreadyExists) {
            assert false;
        }

        try {
            editableSet.removeOrThrowNotExists(b);
            assert false;
        } catch (NotExists e) {}

    }


}
