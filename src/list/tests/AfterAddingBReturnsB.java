package list.tests;


import list.MyList;


public abstract class AfterAddingBReturnsB extends MyListTest {

    @Override protected void run() {

        MyList<String> list = initMyList();

        list.add("B");

        assert list.get(0).equals("B");

    }

}
