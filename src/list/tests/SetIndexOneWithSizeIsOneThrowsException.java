package list.tests;


import list.EditableList;


public abstract class SetIndexOneWithSizeIsOneThrowsException extends MyListTest {

    @Override protected void run() {

        EditableList<String> list = initMyList();

        list.add("A");

        try {
            list.set(1, "B");
            assert false;
        } catch (IndexOutOfBoundsException e) {}

    }

}