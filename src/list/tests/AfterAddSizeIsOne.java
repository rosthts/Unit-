package list.tests;


import list.EditableList;


public abstract class AfterAddSizeIsOne extends MyListTest {

    @Override protected void run() {

        EditableList<String> list = initMyList();

        list.add("A");


        assert list.getSize() == 1;

    }

}
