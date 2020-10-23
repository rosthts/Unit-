package list.tests;


import list.MyList;


public abstract class AfterAddingAAndSettingBReturnsB extends MyListTest {

    @Override protected void run() {

        MyList<String> list = initMyList();

        list.add("A");

        list.set(0, "B");

        assert list.get(0).equals("B");

    }

}
