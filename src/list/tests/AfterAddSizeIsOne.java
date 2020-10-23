package list.tests;


import list.MyList;


public abstract class AfterAddSizeIsOne extends MyListTest {

    @Override protected void run() {

        MyList<String> list = initMyList();

        list.add("A");


        assert list.getSize() == 1;

    }

}
