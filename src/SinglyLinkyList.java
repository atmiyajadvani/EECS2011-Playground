public class SinglyLinkyList<E> {

    // ------ Nested Node Class Starts------
    public static class Node<E> {

        private E data;          // Reference to element stored in the node
        private Node<E> next;    // Reference to the subsequent node in the list

        // Node Constructor
        public Node(E e, Node<E> n){
            data = e;
            next = n;
        }

        // Getter Methods
        public E getData(){
            return data;
        }
        public Node<E> getNext(){
            return next;
        }

        // Setter Methods
        public void setNext(Node<E> n){
            next = n;
        }

    }
    // ------ Nested Node Class Ends------


    // Instance variables of the Singly Linked List
    private Node<E> head = null;   // head node of the list
    private Node<E> tail = null;   // last node of the list
    private int size = 0;          // no of nodes in the list
    public SinglyLinkyList(){};    // Constructs initially empty list

    // Access method
    public int getSize() {
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    public E first(){              // Returns the first element of the list
        if (isEmpty())
            return null;
        else
            return head.getData();
    }

    public E last(){             // Returns the last element of the list
        if (isEmpty())
            return null;
        else
            return tail.getData();
    }

    // Update methods

    public void addFirst(E e){       // adds element e to the front of the list
        head = new Node<>(e, head);  // creates and link to new node
        if (size == 0)
            tail = head;             // special case: new node becomes tail also
        size++;
    }

    public void addLast(E e){        // adds element e to the end of the list
        Node<E> newest = new Node<>(e, null); // node will eventually be the tail
        if(isEmpty())
            head = newest;           // special case: previously empty list
        else
            tail.setNext(newest);    // new node after the existing tail
        tail = newest;               // new node becomes the tail
        size++;
    }

    public E removeFirst(){           // removes and returns the first element
        if (isEmpty())                // nothing to remove
            return null;
        E answer = head.getData();
        head = head.getNext();
        size--;
        if (size == 0)
            tail = null;
        return answer;               // special case as list is now empty
    }







}