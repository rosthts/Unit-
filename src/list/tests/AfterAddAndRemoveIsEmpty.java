package list.tests;


import list.EditableList;


public abstract class AfterAddAndRemoveIsEmpty extends MyListTest {

    @Override protected void run() {

        EditableList<String> list = initMyList();

        list.add("A");

        list.remove(0);

        assert list.isEmpty();

    }

}
