public class DoublyLinkyList <E> {

    // --------- Nested Node Class Starts ---------
    private static class Node<E>{
        private E element;          // reference to the element stored at this node
        private Node<E> prev;       // reference to the previous node in the list
        private Node<E> next;       // reference to the subsequent node in the list

        // Node Constructor
        public Node(E e, Node<E> p, Node<E> n) {
            element = e;
            prev = p;
            next = n;
        }

        // Getter Methods
        public E getElement() {
            return element;
        }
        public Node<E> getPrev() {
            return prev;
        }
        public Node<E> getNext() {
            return next;
        }

        // Setter Methods
        public void setPrev(Node<E> p) {
            prev = p;
        }
        public void setNext(Node<E> n) {
            next = n;
        }
    }

    // --------- Nested Node Class Ends ---------


    // Instance variables of the Doubly Linked List
    private Node<E> header;       // header sentinel
    private Node<E> trailer;      // trailer sentinel
    private int size = 0;         // no of elements in the list

    // Constructs a new empty list
    public DoublyLinkyList(){
        header = new Node<>(null,null,null);    // a new header
        trailer = new Node<>(null,header,null);    // trailer is preceded by header
        header.setNext(trailer);                        // header is followed by the trailer

    }

    public int size(){ return size;}                    // returns no of elements in the linked list
    public boolean isEmpty(){ return size == 0;}        // returns true if the list is empty

    public E first(){                                   // returns the first element of the list
        if(isEmpty())
            return null;
        else
           return header.getNext().getElement();        // first element is beyond header
    }

    public E last(){                                    // returns the last element of the list
        if(isEmpty())
            return null;
        else
            return trailer.getPrev().getElement();      // last element is before trailer
    }
    
    
    // Public update methods
    public void addFirst(E e){                           // adds element e to the front of the list
        addBetween(e, header, header.getNext());         // place just after the header
    }

    public void addLast(E e){                            // adds element e to the end of the list
        addBetween(e, trailer.getPrev(), trailer);       // place just before the trailer
    }

    public E removeFirst(){                              // removes and returns the first element of the list
        if (isEmpty())                              
            return null;                                 // nothing to remove
        return remove(header.getNext());                 // last element is beyond the header
    }

    public E removeLast(){                              // removes and returns the last element of the list
        if (isEmpty())
            return null;                                 // nothing to remove
        return remove(trailer.getPrev());                // last element is before the trailer
    }
    
    
    // Private update methods

    // adds element e to the linked list between given nodes
    private void addBetween(E e, Node<E> predecessor, Node<E> successor) {   
        // create and link a new node
        Node<E> newest = new Node<>(e, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
    }

    // remove given element e from the list and return its element
    private E remove(Node<E> node) {
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        return node.getElement();
    }

}
