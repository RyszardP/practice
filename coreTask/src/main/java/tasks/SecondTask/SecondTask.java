package tasks.SecondTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;

public class SecondTask {
    public static void main(String[] args) throws IOException {

        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        LinkedList linkedList = new LinkedList();

        System.out.println("Insert ten strings" + '\n');
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            linkedList.add(s);
        }

        System.out.println("displaying the contents of the collection on the screen" + '\n');
        for (int i = 0; i < linkedList.size(); i++) {
            int j = linkedList.size() - i - 1;
            System.out.println(linkedList.get(j));
        }

        insert(linkedList);
        getByIndex(linkedList, 1);
        setByIndex(linkedList, 1);
        removeByIndex(linkedList, 1);
    }

    public static void insert(List list) {
        list.add("1");
    }

    public static void getByIndex(List list, int index) {
        list.get(index);
    }

    public static void setByIndex(List list, int index) {
        list.set(index, "a");
    }

    public static void removeByIndex(List list, int index) {
        list.remove(index);
    }
}