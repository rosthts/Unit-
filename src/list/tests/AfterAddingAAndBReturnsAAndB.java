package list.tests;


import list.MyList;


public abstract class AfterAddingAAndBReturnsAAndB extends MyListTest {

    @Override protected void run() {

        MyList<String> list = initMyList();

        list.add("A");
        list.add("B");

        assert list.get(0).equals("A");
        assert list.get(1).equals("B");

    }

}
