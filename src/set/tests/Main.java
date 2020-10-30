package set.tests;


import set.ArraySet;
import set.EditableSet;
import throwables.NotExists;


public class Main {


    public static void main (String[] args) throws NotExists {

        new EditableSetTestsSuite() {
            @Override protected <Item> EditableSet<Item> initEditableSet() {
                return new ArraySet<>();
            }
        }.run();

    }


}
