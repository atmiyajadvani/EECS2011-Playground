import java.util.LinkedList;

public class SinglyLinkedList<E> {

    // ------ Nested Node Class------
    public static class Node<T> {

        private T data;          // Reference to element stored in the node
        private Node<T> next;    // Reference to the subsequent node in the list

        // Node Constructor
        public Node(T e, Node<T> n){
            data = e;
            next = n;
        }

        // Getter Methods
        public T getData(){
            return data;
        }
        public Node<T> getNext(){
            return next;
        }

        // Setter Methods
        public void setNext(Node<T> n){
            next = n;
        }

        // Instance variables of the Singly Linked List
        private Node<T> head = null;   // head node of the list
        private Node<T> tail = null;   // last node of the list
        private int size = 0;          // no of nodes in the list

        public int getSize() {
            return size;
        }
        public boolean isEmpty(){ return size == 0;}

        public T first(){
            if (isEmpty() == true)
                return null;
            else
                return head.getData();
        }

        public T last(){
            if (isEmpty() == true)
                return null;
            else
                return tail.getData();
        }



    }
}