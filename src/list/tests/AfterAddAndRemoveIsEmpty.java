package list.tests;


import list.MyList;


public abstract class AfterAddAndRemoveIsEmpty extends MyListTest {

    @Override protected void run() {

        MyList<String> list = initMyList();

        list.add("Item1");

        list.remove(0);

        assert list.isEmpty();

    }

}
