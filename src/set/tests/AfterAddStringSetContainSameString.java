package set.tests;


import set.EditableSet;
import throwables.AlreadyExists;
import throwables.NotExists;


abstract class AfterAddStringSetContainSameString {


    abstract EditableSet<Object> initEditableSet();


    void run() throws NotExists {

        EditableSet<Object> editableSet = initEditableSet();

        try {
            editableSet.addOrThrowAlreadyExists(new String("a"));
        } catch (AlreadyExists alreadyExists) {
            assert false;
        }

        assert editableSet.contains(new String("a"));

    }


}
