package set;


import action.Action1;
import throwables.AlreadyExists;
import throwables.NotExists;


public class ArraySet<Item> implements EditableSet<Item> {

	boolean containsNull = false;
	int size = 0;
	private Object[] array = new Object[10];

	@Override
	public int getSize() {
		if (containsNull) {
			return size + 1;
		} else {
			return size;
		}
	}

	@Override
	public boolean contains(Item item) {
		if (item == null) return containsNull;
		else {
			for (int i = 0; i < size; i++) {
				if (array[i].equals(item)) {
					return true;
				}
			}
			return false;
		}
	}


	@Override
	public void forEach(Action1<Item> action) {
		if (containsNull) action.run(null);
		for (int i = 0; i < size; i++){
			action.run((Item) array[i]);
		}
	}

	@Override
	public void addOrThrowAlreadyExists(Item item) throws AlreadyExists {
		if (item == null) {
			if (containsNull) throw new AlreadyExists();
			containsNull = true;
			return;
		}
		if (size == array.length) {
			Object[] newArray = new Object[array.length * 2];
			for (int j = 0; j < size; j++) {
				newArray[j] = array[j];
			}
			array = newArray;
		}
		for (int i = 0; i < size; i++) {
			if (array[i].equals(item)) throw new AlreadyExists();
		}
		array[size] = item;
		size++;
	}

	@Override
	public void removeOrThrowNotExists(Item item) throws NotExists {
		if (item == null) {
			if (!containsNull) throw new NotExists();
			containsNull = false;
			return;
		}
		for (int i = 0; i < size; i++) {
			if (array[i].equals(item)) {
				while (i < size - 1) {
					array[i] = array[i + 1];
					i++;
				}
				size--;
				return;
			}
		}
		throw new NotExists();
	}

}
