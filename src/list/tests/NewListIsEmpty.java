package list.tests;


import list.EditableList;

public abstract class NewListIsEmpty extends MyListTest {

    @Override protected void run() {

        EditableList<String> list = initMyList();

        assert list.isEmpty();

    }

}
