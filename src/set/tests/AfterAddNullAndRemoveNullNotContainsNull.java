package set.tests;


import set.EditableSet;
import throwables.AlreadyExists;
import throwables.NotExists;


abstract class AfterAddNullAndRemoveNullNotContainsNull {


    abstract EditableSet<Object> initEditableSet();


    void run() throws NotExists {

        EditableSet<Object> editableSet = initEditableSet();

        try {
            editableSet.addOrThrowAlreadyExists(null);
        } catch (AlreadyExists alreadyExists) {
            assert false;
        }

        try {
            editableSet.removeOrThrowNotExists(null);
        } catch (NotExists e) {
            assert false;
        }

        assert !editableSet.contains(null);

    }


}
