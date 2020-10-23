package list.tests;


import list.MyList;


public abstract class IfRemovingFromEmptyListThrowsException extends MyListTest {

    @Override protected void run() {

        MyList<String> list = initMyList();

        try {

            list.remove(0);

            assert false;

        } catch (IndexOutOfBoundsException e) {}

    }

}
