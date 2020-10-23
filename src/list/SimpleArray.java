package list;

public class SimpleArray{
     final private int defaultSize = 0;
     String[] array = new String[defaultSize];

    public void add(String s){
        String[] help = array;
        array = new String[help.length+1];
        System.arraycopy(help, 0, array, 0, help.length);
        array[help.length+1] = s;
    }

}
