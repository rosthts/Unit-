package list.tests;


import list.EditableList;


public abstract class SetToEmptyListThrowsException extends MyListTest {

    @Override protected void run() {

        EditableList<String> list = initMyList();

        try {
            list.set(0, "A");
            assert false;
        } catch (IndexOutOfBoundsException e) {}

    }

}
