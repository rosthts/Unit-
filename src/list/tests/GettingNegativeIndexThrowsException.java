package list.tests;


import list.MyList;


public abstract class GettingNegativeIndexThrowsException extends MyListTest {

    @Override protected void run() {

        MyList<String> list = initMyList();

        list.add("A");

        try {
            list.get(-1);
            assert false;
        } catch (IndexOutOfBoundsException e) {}

    }

}
