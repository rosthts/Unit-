package list.tests;


import list.EditableList;


public abstract class AfterRemoveElementLenghtDecrements extends MyListTest {

    @Override protected void run() {

        EditableList<String> list = initMyList();
        for (int i = 0; i < 9; i++) {list.add(Integer.toString(i));}
        list.remove(5);

        assert list.getSize() == 8;
        assert list.get(4).equals("4");
        assert list.get(7).equals("8");
        assert list.get(5).equals("6");
    }

}
