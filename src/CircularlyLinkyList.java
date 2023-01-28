public class CircularlyLinkyList<E> {

    // ------ Nested Node Class Starts------
    public static class Node<E> {

        private E data;          // Reference to element stored in the node
        private CircularlyLinkyList.Node<E> next;    // Reference to the subsequent node in the list

        // Node Constructor
        public Node(E e, CircularlyLinkyList.Node<E> n) {
            data = e;
            next = n;
        }

        // Getter Methods
        public E getData() {
            return data;
        }

        public CircularlyLinkyList.Node<E> getNext() {
            return next;
        }

        // Setter Methods
        public void setNext(CircularlyLinkyList.Node<E> n) {
            next = n;
        }

    }
    // ------ Nested Node Class Ends------


    // Instance variables of the Circularly Linked List
    private Node<E> tail = null;       // we store tail (but not head)
    private int size = 0;              // no of nodes in the list
    public CircularlyLinkyList() {}    // Constructs an initially empty list

    // Access method
    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {              // Returns the first element of the list
        if (isEmpty())
            return null;
        else
            return tail.getNext().getData(); // the head is after the tail
    }

    public E last() {             // Returns the last element of the list
        if (isEmpty())
            return null;
        else
            return tail.getData();
    }


    // Update methods
    public void rotate(){              // rotates the first element to the back of the list
        if (tail != null)              // if empty, do nothing
            tail = tail.getNext();     // the old head becomes the new tail
    }

    public void addFirst(E e) {       // adds element e to the front of the list
        if (size == 0){
            tail = new Node<>(e, null);         // special case: new node becomes tail also
            tail.setNext(tail);                    // Link to itself circularly
        }
        else{
            Node<E> newest = new Node<>(e, tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }

    public void addLast(E e) {        // adds element e to the end of the list
       addFirst(e);                   // insert the new element at the front of the list
       tail = tail.getNext();         // now new element becomes the tail
    }

    public E removeFirst() {           // removes and returns the first element
        if (isEmpty())                 // nothing to remove
            return null;
        Node<E> head = tail.getNext();
        if (head == tail)
            tail = null;                // must be the only node left
        else
            tail.setNext(head.getNext()); // removes 'head' from the list
        size--;
        return head.getData();
    }
}