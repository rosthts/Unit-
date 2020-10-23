package list.tests;


public abstract class MyListTestSuite extends MyListTest {

    protected abstract MyListTest[] initTests();

    @Override protected void run() {

        MyListTest[] tests = initTests();

        for (MyListTest test : tests) {
            test.run();
        }

    }

}
