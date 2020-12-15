package list;


import action.Action1;
import action.Action2;
import collection.EditableCollection;
import condition.Condition1;
import throwables.Found;
import throwables.NotExists;


public interface EditableList<Item> extends EditableCollection<Item> {

	void remove(int index);
	void insert (int index, Item item);
	Item get (int index);
	void set (int index, Item item);

	default void add(Item item) {
		insert(getSize(), item);
	}

	void forEachIndexed (Action2<Integer, Item> action);

	default @Override void forEach (Action1<Item> action) {
		forEachIndexed((index, item) -> {
			action.run(item);
		});
	}

	default @Override void removeOneOrThrowNotExists (Condition1<Item> condition) throws NotExists {
		try {
			forEachIndexed((index, item) -> {
				if (condition.check(item)) {
					throw new Found(index);
				}
			});
			throw new NotExists();
		} catch (Found found) {
			int index = (Integer) found.value;
			remove(index);
		}
	}

}
