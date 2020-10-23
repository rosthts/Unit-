package list.tests;


import list.MyList;


public abstract class GetFromEmptyListThrowsException extends MyListTest {

    @Override protected void run() {

        MyList<String> list = initMyList();

        try {
            list.get(0);
            assert false;
        } catch (IndexOutOfBoundsException e) {}

    }

}
