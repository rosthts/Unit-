package set.tests;


import set.EditableSet;
import throwables.AlreadyExists;
import throwables.NotExists;


abstract class AfterAddObjectAndRemoveObjectNotContainObject {


    abstract EditableSet<Object> initEditableSet();


    void run() throws NotExists {

        EditableSet<Object> editableSet = initEditableSet();

        Object a = new Object();
        Object b = new Object();
        Object c = new Object();



        try {
            editableSet.addOrThrowAlreadyExists(new String("a"));
        } catch (AlreadyExists alreadyExists) {
            assert false;
        }


        try {
            editableSet.removeOrThrowNotExists(new String("a"));
        } catch (NotExists e) {
            assert false;
        }


        assert !editableSet.contains(new String("a"));


    }


}
