package list.tests;


import list.LinkedList;
import list.EditableList;

public class Main {

    public static void main (String[] args) {

        new MyListTestSuite() {

            @Override protected EditableList<String> initMyList() {
                return new LinkedList<>();
            }

            @Override protected MyListTest[] initTests() {

                MyListTestSuite suite = this;

                return new MyListTest[] {

                    new NewListIsEmpty() {
                        @Override protected EditableList<String> initMyList() {
                            return suite.initMyList();
                        }
                    },

                    new AfterAddSizeIsOne() {
                        @Override protected EditableList<String> initMyList() {
                            return suite.initMyList();
                        }
                    },

                    new IfRemovingFromEmptyListThrowsException() {
                        @Override protected EditableList<String> initMyList() {
                            return suite.initMyList();
                        }
                    },

                    new AfterAddAndRemoveIsEmpty() {
                        @Override protected EditableList<String> initMyList() {
                            return suite.initMyList();
                        }
                    },

                    new GetFromEmptyListThrowsException() {
                        @Override protected EditableList<String> initMyList() {
                            return suite.initMyList();
                        }
                    },

                    new AfterAddingAReturnsA() {
                        @Override protected EditableList<String> initMyList() {
                            return suite.initMyList();
                        }
                    },

                    new AfterAddingBReturnsB() {
                        @Override protected EditableList<String> initMyList() {
                            return suite.initMyList();
                        }
                    },

                    new AfterAddingAAndSettingBReturnsB() {
                        @Override protected EditableList<String> initMyList() {
                            return suite.initMyList();
                        }
                    },

                    new GettingNegativeIndexThrowsException() {
                        @Override protected EditableList<String> initMyList() {
                            return suite.initMyList();
                        }
                    },

                    new GettingIndexOneWithSizeIsOneThrowsException() {
                        @Override protected EditableList<String> initMyList() {
                            return suite.initMyList();
                        }
                    },

                    new AfterAddingAAndBReturnsAAndB() {
                        @Override protected EditableList<String> initMyList() {
                            return suite.initMyList();
                        }
                    },
                    new SetIndexOneWithSizeIsOneThrowsException() {
                        @Override protected EditableList<String> initMyList() {
                            return suite.initMyList();
                        }
                    },
                    new AfterInsertAThenBReturnsBThenA() {
                        @Override protected EditableList<String> initMyList() {
                            return suite.initMyList();
                        }
                    },
                     new AfterRemoveElementLenghtDecrements() {
                         @Override protected EditableList<String> initMyList() {
                             return suite.initMyList();
                         }
                     },
                     new AfterInsertElementLengthIncrements() {
                         @Override protected EditableList<String> initMyList() {
                             return suite.initMyList();
                         }
                     },
                      new SetToEmptyListThrowsException() {
                          @Override protected EditableList<String> initMyList() {
                              return suite.initMyList();
                          }
                      },
                      new SetToNegativeIndexThrowsException() {
                          @Override protected EditableList<String> initMyList() {
                              return suite.initMyList();
                          }
                      },
                        new AfterAddАAndBAndRemoveIndexOReturnB() {
                            @Override protected EditableList<String> initMyList() {
                                return suite.initMyList();
                            }
                        }

                };

            }

        }.run();

    }

}
