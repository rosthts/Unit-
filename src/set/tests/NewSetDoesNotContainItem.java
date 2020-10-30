package set.tests;


import set.EditableSet;


abstract class NewSetDoesNotContainItem {


    abstract EditableSet<Object> initEditableSet();


    void run() {

        EditableSet<Object> editableSet = initEditableSet();

        assert !editableSet.contains(new Object());

    }


}
