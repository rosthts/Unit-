package set.tests;


import set.EditableSet;
import throwables.NotExists;


public abstract class EditableSetTestsSuite {


    protected abstract <Item>EditableSet<Item> initEditableSet();


    void run() throws NotExists {

        new NewSetIsEmpty() {
            @Override EditableSet<Object> initEditableSet() {
                return EditableSetTestsSuite.this.initEditableSet();
            }
        }.run();

        new NewSetDoesNotContainItem() {
            @Override EditableSet<Object> initEditableSet() {
                return EditableSetTestsSuite.this.initEditableSet();
            }
        }.run();

        new ContainsAddedItem() {
            @Override EditableSet<Object> initEditableSet() {
                return EditableSetTestsSuite.this.initEditableSet();
            }
        }.run();
        new AfterAddSizeIsOne() {
            @Override EditableSet<Object> initEditableSet() {
                return EditableSetTestsSuite.this.initEditableSet();
            }
        }.run();
        new RemovingFromEmptySetThrowsNotExists() {
            @Override EditableSet<Object> initEditableSet() {
                return EditableSetTestsSuite.this.initEditableSet();
            }
        }.run();
        new AfterAddAndRemoveSetIsEmpty() {
            @Override EditableSet<Object> initEditableSet() {
                return EditableSetTestsSuite.this.initEditableSet();
            }
        }.run();
        new AfterAddAAndAddAThrowsAlreadyExists() {
            @Override EditableSet<Object> initEditableSet() {
                return EditableSetTestsSuite.this.initEditableSet();
            }
        }.run();
        new AfterAddAAndAddBSetContainsAAndBAndDoesntContainC() {
            @Override EditableSet<Object> initEditableSet() {
                return EditableSetTestsSuite.this.initEditableSet();
            }
        }.run();
        new AfterRemoveBDoesntContainB() {
            @Override EditableSet<Object> initEditableSet() {
                return EditableSetTestsSuite.this.initEditableSet();
            }
        }.run();

        new ForEachTest() {
            @Override EditableSet<Object> initEditableSet() {
                return EditableSetTestsSuite.this.initEditableSet();
            }
        }.run();
        new AfterAddElementLenghtIncr() {
            @Override EditableSet<Object> initEditableSet() {
                return EditableSetTestsSuite.this.initEditableSet();
            }
        }.run();
        new AfterAddSameStringNotThrowsAlreadyExists() {
            @Override EditableSet<Object> initEditableSet() {
                return EditableSetTestsSuite.this.initEditableSet();
            }
        }.run();
        new AfterAddNullSetContainsNull() {
            @Override EditableSet<Object> initEditableSet() {
                return EditableSetTestsSuite.this.initEditableSet();
            }
        }.run();
        new AfterAddingItemDoesntContainNull() {
            @Override EditableSet<Object> initEditableSet() {
                return EditableSetTestsSuite.this.initEditableSet();
            }
        }.run();
        new AfterAddStringSetContainSameString() {
            @Override EditableSet<Object> initEditableSet() {
                return EditableSetTestsSuite.this.initEditableSet();
            }
        }.run();
        new AfterAddObjectAndRemoveObjectNotContainObject() {
            @Override EditableSet<Object> initEditableSet() {
                return EditableSetTestsSuite.this.initEditableSet();
            }
        }.run();
        new AfterAddNullAndRemoveNullNotContainsNull() {
            @Override EditableSet<Object> initEditableSet() {
                return EditableSetTestsSuite.this.initEditableSet();
            }
        }.run();
        new AfterAddAAndRemoveBThrowsException() {
            @Override EditableSet<Object> initEditableSet() {
                return EditableSetTestsSuite.this.initEditableSet();
            }
        }.run();
        new ForEachNullTest() {
            @Override EditableSet<Object> initEditableSet() {
                return EditableSetTestsSuite.this.initEditableSet();
            }
        }.run();
        new AfterAddNullAndAddNullThrowsAlreadyExists() {
            @Override EditableSet<Object> initEditableSet() {
                return EditableSetTestsSuite.this.initEditableSet();
            }
        }.run();
        new AfterRemoveNullThrowsException() {
            @Override EditableSet<Object> initEditableSet() {
                return EditableSetTestsSuite.this.initEditableSet();
            }
        }.run();
        new AfterAddNullAndAddAContainsA() {
            @Override EditableSet<Object> initEditableSet() {
                return EditableSetTestsSuite.this.initEditableSet();
            }
        }.run();

    }


}
