package set.tests;


import action.Action1;
import set.EditableSet;
import throwables.AlreadyExists;
import throwables.NotExists;


abstract class ForEachTest {


	abstract EditableSet<Object> initEditableSet();


	private boolean isCalledForA;
	private boolean isCalledForC;


	void run() {

		isCalledForA = false;
		isCalledForC = false;

		EditableSet<Object> editableSet = initEditableSet();

		Object a = new Object();
		Object b = new Object();
		Object c = new Object();

		try {
			editableSet.addOrThrowAlreadyExists(a);
		} catch (AlreadyExists alreadyExists) {
			assert false;
		}

		try {
			editableSet.addOrThrowAlreadyExists(b);
		} catch (AlreadyExists alreadyExists) {
			assert false;
		}

		try {
			editableSet.addOrThrowAlreadyExists(c);
		} catch (AlreadyExists alreadyExists) {
			assert false;
		}

		try {
			editableSet.removeOrThrowNotExists(b);
		} catch (NotExists notExists) {
			assert false;
		}

		editableSet.forEach(
			new Action1<Object>() {
				@Override public void run (Object item) {
					if (item == a) {
						assert !isCalledForA;
						isCalledForA = true;
					} else
					if (item == c) {
						assert !isCalledForC;
						isCalledForC = true;
					}
					else assert false;
				}
			}
		);

		assert isCalledForA;
		assert isCalledForC;

	}


}
