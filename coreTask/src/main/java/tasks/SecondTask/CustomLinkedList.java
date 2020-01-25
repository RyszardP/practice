package tasks.SecondTask;



import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * this linked list created with List implementation
 */
public class CustomLinkedList {



    private static int counter;
    private Node head;


    public CustomLinkedList() {
    }

    private static int getCounter() {
        return counter;
    }

    private static void incrementCounter() {
        counter++;
    }

    private void decrementCounter() {
        counter--;
    }

    public void add(Object data) {

        if (head == null) {
            head = new Node(data);
        }
        Node customTemp = new Node(data);
        Node customCurrent = head;

        if (customCurrent != null) {
            while (customCurrent.getNext() != null) {
                customCurrent = customCurrent.getNext();
            }
            customCurrent.setNext(customTemp);
        }
        incrementCounter();
    }

    public void add(Object data, int index) {
        Node customTemp = new Node(data);
        Node customCurrent = head;
        if (customCurrent != null) {

            for (int i = 0; i < index && customCurrent.getNext() != null; i++) {
                customCurrent = customCurrent.getNext();
            }
        }
        customTemp.setNext(customCurrent.getNext());
        customCurrent.setNext(customTemp);
        incrementCounter();
    }

    public Object get(int index)
    {
        if (index < 0)
            return null;
        Node customCurrent = null;
        if (head != null) {
            customCurrent = head.getNext();
            for (int i = 0; i < index; i++) {
                if (customCurrent.getNext() == null)
                    return null;

                customCurrent = customCurrent.getNext();
            }
            return customCurrent.getData();
        }
        return customCurrent;
    }


    public boolean remove(int index) {
        if (index < 1 || index > size())
            return false;
        Node customCurrent = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (customCurrent.getNext() == null)
                    return false;
                customCurrent = customCurrent.getNext();
            }
            customCurrent.setNext(customCurrent.getNext().getNext());
            decrementCounter();
            return true;
        }
        return false;
    }

    public int size() {
        return getCounter();
    }

    public String toString() {
        String output = "";
        if (head != null) {
            Node customCurrent = head.getNext();
            while (customCurrent != null) {
                output += "[" + customCurrent.getData().toString() + "]";
                customCurrent = customCurrent.getNext();
            }
        }
        return output;
    }

}

