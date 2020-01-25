package tasks.SecondTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;


public class SecondTask  extends CustomLinkedList{
    public static void main(String[] args) throws IOException {

        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        CustomLinkedList linkedList = new CustomLinkedList();

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


        linkedList.add("t",2);
        System.out.println(linkedList);
        linkedList.add("3");
        System.out.println(linkedList);
        linkedList.size();
        linkedList.get(2);

        linkedList.remove(2);
        System.out.println(linkedList);
    }







}