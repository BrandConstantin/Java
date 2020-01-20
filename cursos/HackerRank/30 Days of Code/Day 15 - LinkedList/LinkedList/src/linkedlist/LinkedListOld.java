package linkedlist;

import java.util.LinkedList;

/**
 *
 * @author BrandConstantin
 */
public class LinkedListOld {

    //properties
    Node head;
    int count;

    //constructers
//    public LinkedList(){
//        this.head = null;
//        this.count = 0;
//    }
    public LinkedListOld(Node newHead) {
        this.head = newHead;
        this.count = 1;
    }

    //methods (add, get, size, isEmpty, remove)
    public void add(int newData) {
        Node temp = new Node(newData);
        Node current = head;

        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(temp);
        count++;
    }

    public int get(int index) {
        if (index <= 0) {
            return -1;
        }

        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }

        return current.getData();
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void remove() {
        //remove from the back of the list
        Node current = head;

        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }

        current.setNext(null);
        count--;
    }

    /**
     * @param args the command line arguments
     */
    
    //all the line code write before we cant replace with LinkedList
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<String>();
        
        linkedlist.add("José");
        System.err.println(linkedlist);
    }

}
