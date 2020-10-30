package list.tests;


import list.MyList;


public abstract class AfterAddАAndBAndRemoveIndexOReturnB extends MyListTest {

    @Override protected void run() {

        MyList<String> list = initMyList();

        list.add("A");
        list.add("B");


        list.remove(0);
        assert list.get(0).equals("B");

    }

}
