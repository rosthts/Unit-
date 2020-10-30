package list.tests;


import list.MyArrayList;
import list.MyLinkedList;
import list.MyList;

public class Main {

    public static void main (String[] args) {

        new MyListTestSuite() {

            @Override protected MyList<String> initMyList() {
                return new MyLinkedList<>();
            }

            @Override protected MyListTest[] initTests() {

                MyListTestSuite suite = this;

                return new MyListTest[] {

                    new NewListIsEmpty() {
                        @Override protected MyList<String> initMyList() {
                            return suite.initMyList();
                        }
                    },

                    new AfterAddSizeIsOne() {
                        @Override protected MyList<String> initMyList() {
                            return suite.initMyList();
                        }
                    },

                    new IfRemovingFromEmptyListThrowsException() {
                        @Override protected MyList<String> initMyList() {
                            return suite.initMyList();
                        }
                    },

                    new AfterAddAndRemoveIsEmpty() {
                        @Override protected MyList<String> initMyList() {
                            return suite.initMyList();
                        }
                    },

                    new GetFromEmptyListThrowsException() {
                        @Override protected MyList<String> initMyList() {
                            return suite.initMyList();
                        }
                    },

                    new AfterAddingAReturnsA() {
                        @Override protected MyList<String> initMyList() {
                            return suite.initMyList();
                        }
                    },

                    new AfterAddingBReturnsB() {
                        @Override protected MyList<String> initMyList() {
                            return suite.initMyList();
                        }
                    },

                    new AfterAddingAAndSettingBReturnsB() {
                        @Override protected MyList<String> initMyList() {
                            return suite.initMyList();
                        }
                    },

                    new GettingNegativeIndexThrowsException() {
                        @Override protected MyList<String> initMyList() {
                            return suite.initMyList();
                        }
                    },

                    new GettingIndexOneWithSizeIsOneThrowsException() {
                        @Override protected MyList<String> initMyList() {
                            return suite.initMyList();
                        }
                    },

                    new AfterAddingAAndBReturnsAAndB() {
                        @Override protected MyList<String> initMyList() {
                            return suite.initMyList();
                        }
                    },
                    new SetIndexOneWithSizeIsOneThrowsException() {
                        @Override protected MyList<String> initMyList() {
                            return suite.initMyList();
                        }
                    },
                    new AfterInsertAThenBReturnsBThenA() {
                        @Override protected MyList<String> initMyList() {
                            return suite.initMyList();
                        }
                    },
                     new AfterRemoveElementLenghtDecrements() {
                         @Override protected MyList<String> initMyList() {
                             return suite.initMyList();
                         }
                     },
                     new AfterInsertElementLengthIncrements() {
                         @Override protected MyList<String> initMyList() {
                             return suite.initMyList();
                         }
                     },
                      new SetToEmptyListThrowsException() {
                          @Override protected MyList<String> initMyList() {
                              return suite.initMyList();
                          }
                      },
                      new SetToNegativeIndexThrowsException() {
                          @Override protected MyList<String> initMyList() {
                              return suite.initMyList();
                          }
                      },
                        new AfterAddАAndBAndRemoveIndexOReturnB() {
                            @Override protected MyList<String> initMyList() {
                                return suite.initMyList();
                            }
                        }

                };

            }

        }.run();

    }

}
