package list.tests;


import list.MyList;


public abstract class AfterAddingAReturnsA extends MyListTest {

    @Override protected void run() {

        MyList<String> list = initMyList();

        list.add("A");

        assert list.get(0).equals("A");

    }

}
