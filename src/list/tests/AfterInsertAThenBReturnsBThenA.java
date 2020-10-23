package list.tests;


import list.MyList;


public abstract class AfterInsertAThenBReturnsBThenA extends MyListTest {

    @Override protected void run() {

        MyList<String> list = initMyList();

        list.insert(0,"A");
        list.insert(0, "B");


        assert list.get(0).equals("B");
        assert list.get(1).equals("A");


    }

}
