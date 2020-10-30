package set.tests;


import set.EditableSet;
import throwables.AlreadyExists;
import throwables.NotExists;


abstract class AfterAddNullAndAddNullThrowsAlreadyExists {


    abstract EditableSet<Object> initEditableSet();


    void run() throws NotExists {

        EditableSet<Object> editableSet = initEditableSet();


        try {
            editableSet.addOrThrowAlreadyExists(null);
        } catch (AlreadyExists alreadyExists) {
            assert false;
        }

        try {
            editableSet.addOrThrowAlreadyExists(null);
            assert false;
        } catch (AlreadyExists alreadyExists) {}

    }


}
