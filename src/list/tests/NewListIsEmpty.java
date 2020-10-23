package list.tests;


import list.MyList;

public abstract class NewListIsEmpty extends MyListTest {

    @Override protected void run() {

        MyList<String> list = initMyList();

        assert list.isEmpty();

    }

}
