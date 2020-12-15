package set.tests;


import set.ArraySet;
import set.EditableSet;
import set.HashSet;
import set.ListSet;
import set.tests.hashset.HashSetTestsSuite;
import throwables.NotExists;


public class Main {


	public static void main (String[] args) throws NotExists {

		new EditableSetTestsSuite() {
			@Override protected <Item> EditableSet<Item> initEditableSet() {
				return new ArraySet<>();
			}
		}.run();

		new EditableSetTestsSuite() {
			@Override protected <Item> EditableSet<Item> initEditableSet() {
				return new ListSet<>();
			}
		}.run();

		new EditableSetTestsSuite() {
			@Override protected <Item> EditableSet<Item> initEditableSet() {
				return new HashSet<>();
			}
		}.run();

		new HashSetTestsSuite() {
			@Override protected <Item> HashSet<Item> initHashSet() {
				return new HashSet<>();
			}
		}.run();

	}


}
