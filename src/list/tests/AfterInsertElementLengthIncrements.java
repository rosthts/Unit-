package list.tests;


import list.MyList;


public abstract class AfterInsertElementLengthIncrements extends MyListTest {

    @Override protected void run() {

        MyList<String> list = initMyList();
        for (int i = 0; i < 15; i++) {list.add(Integer.toString(i));}
        list.insert(5, "C");

        assert list.getSize() == 16;
        assert list.get(5).equals("C");
        assert list.get(15).equals("14");
        assert list.get(14).equals("13");
        assert list.get(6).equals("5");
    }

}
