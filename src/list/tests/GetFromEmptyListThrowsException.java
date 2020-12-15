package list.tests;


import list.EditableList;


public abstract class GetFromEmptyListThrowsException extends MyListTest {

    @Override protected void run() {

        EditableList<String> list = initMyList();

        try {
            list.get(0);
            assert false;
        } catch (IndexOutOfBoundsException e) {}

    }

}
