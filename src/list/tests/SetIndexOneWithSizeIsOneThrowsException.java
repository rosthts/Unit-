package list.tests;


import list.MyList;


public abstract class SetIndexOneWithSizeIsOneThrowsException extends MyListTest {

    @Override protected void run() {

        MyList<String> list = initMyList();

        list.add("A");

        try {
            list.set(1, "B");
            assert false;
        } catch (IndexOutOfBoundsException e) {}

    }

}