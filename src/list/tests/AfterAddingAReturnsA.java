package list.tests;


import list.EditableList;


public abstract class AfterAddingAReturnsA extends MyListTest {

    @Override protected void run() {

        EditableList<String> list = initMyList();

        list.add("A");

        assert list.get(0).equals("A");

    }

}
