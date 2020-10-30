package set.tests;


import set.EditableSet;
import throwables.AlreadyExists;
import throwables.NotExists;


abstract class AfterAddElementLenghtIncr {


    abstract EditableSet<Object> initEditableSet();


    void run() throws NotExists {

        EditableSet<Object> editableSet = initEditableSet();

        Object a = new Object();
        Object b = new Object();
        Object c = new Object();

        for (int i = 0; i < 15; i++){
            try {
                editableSet.addOrThrowAlreadyExists(new Object());
            } catch (AlreadyExists alreadyExists) {
                assert false;
            }
        }

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


    }


}
