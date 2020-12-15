package list.tests;


import list.EditableList;


public abstract class SetToNegativeIndexThrowsException extends MyListTest {

    @Override protected void run() {

        EditableList<String> list = initMyList();

        list.add("A");

        try {
            list.set(-1, "A");
            assert false;
        } catch (IndexOutOfBoundsException e) {}

    }

}
