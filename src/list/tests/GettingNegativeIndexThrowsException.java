package list.tests;


import list.EditableList;


public abstract class GettingNegativeIndexThrowsException extends MyListTest {

    @Override protected void run() {

        EditableList<String> list = initMyList();

        list.add("A");

        try {
            list.get(-1);
            assert false;
        } catch (IndexOutOfBoundsException e) {}

    }

}
