package list.tests;


import list.MyList;


public abstract class SetToEmptyListThrowsException extends MyListTest {

    @Override protected void run() {

        MyList<String> list = initMyList();

        try {
            list.set(0, "A");
            assert false;
        } catch (IndexOutOfBoundsException e) {}

    }

}
