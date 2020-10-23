package list.tests;


import list.MyList;


public abstract class SetToNegativeIndexThrowsException extends MyListTest {

    @Override protected void run() {

        MyList<String> list = initMyList();

        list.add("A");

        try {
            list.set(-1, "A");
            assert false;
        } catch (IndexOutOfBoundsException e) {}

    }

}
