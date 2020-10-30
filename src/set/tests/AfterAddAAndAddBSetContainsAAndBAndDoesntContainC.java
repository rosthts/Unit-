package set.tests;


import set.EditableSet;
import throwables.AlreadyExists;
import throwables.NotExists;


abstract class AfterAddAAndAddBSetContainsAAndBAndDoesntContainC {


    abstract EditableSet<Object> initEditableSet();


    void run() throws NotExists {

        EditableSet<Object> editableSet = initEditableSet();

        Object a = new Object();
        Object b = new Object();
        Object c = new Object();

        try {
            editableSet.addOrThrowAlreadyExists(a);
        } catch (AlreadyExists alreadyExists) {
            assert false;
        }

        try {
            editableSet.addOrThrowAlreadyExists(b);
        } catch (AlreadyExists alreadyExists) {
            assert false;
        }

        assert editableSet.contains(a);
        assert editableSet.contains(b);
        assert !editableSet.contains(c);

    }


}
