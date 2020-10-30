package set.tests;


import set.EditableSet;


abstract class NewSetIsEmpty {


    abstract EditableSet<Object> initEditableSet();


    void run() {

        EditableSet<Object> editableSet = initEditableSet();

        assert editableSet.isEmpty();

    }


}
