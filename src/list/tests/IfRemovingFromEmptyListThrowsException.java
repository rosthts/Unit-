package list.tests;


import list.EditableList;


public abstract class IfRemovingFromEmptyListThrowsException extends MyListTest {

    @Override protected void run() {

        EditableList<String> list = initMyList();

        try {

            list.remove(0);

            assert false;

        } catch (IndexOutOfBoundsException e) {}

    }

}
