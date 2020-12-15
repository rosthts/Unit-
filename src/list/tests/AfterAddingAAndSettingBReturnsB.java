package list.tests;


import list.EditableList;


public abstract class AfterAddingAAndSettingBReturnsB extends MyListTest {

    @Override protected void run() {

        EditableList<String> list = initMyList();

        list.add("A");

        list.set(0, "B");

        assert list.get(0).equals("B");

    }

}
