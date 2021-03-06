package set.tests;


import set.EditableSet;
import throwables.AlreadyExists;


abstract class AfterAddSizeIsOne {


    abstract EditableSet<Object> initEditableSet();


    void run() {

        EditableSet<Object> editableSet = initEditableSet();

        Object item = new Object();

        try {
            editableSet.addOrThrowAlreadyExists(item);
        } catch (AlreadyExists alreadyExists) {
            assert false;
        }

        assert editableSet.getSize() == 1;

    }


}
