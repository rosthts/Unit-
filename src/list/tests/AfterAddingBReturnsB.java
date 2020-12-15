package list.tests;


import list.EditableList;


public abstract class AfterAddingBReturnsB extends MyListTest {

    @Override protected void run() {

        EditableList<String> list = initMyList();

        list.add("B");

        assert list.get(0).equals("B");

    }

}
