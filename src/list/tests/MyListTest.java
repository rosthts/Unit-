package list.tests;


import list.EditableList;


public abstract class MyListTest {

    protected abstract EditableList<String> initMyList();

    protected abstract void run();

}
