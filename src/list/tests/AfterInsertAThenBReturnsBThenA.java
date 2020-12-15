package list.tests;


import list.EditableList;


public abstract class AfterInsertAThenBReturnsBThenA extends MyListTest {

    @Override protected void run() {

        EditableList<String> list = initMyList();

        list.insert(0,"A");
        list.insert(0, "B");


        assert list.get(0).equals("B");
        assert list.get(1).equals("A");


    }

}
