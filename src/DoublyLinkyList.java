public class DoublyLinkyList <T> {

    // --------- Nested Node Class ---------
    private static class Node<T>{
        private T data;
        private Node<T> previous;
        private Node<T> next;

        // Node Constructor
        public Node(T e, Node<T> p, Node<T> n) {
            data = e;
            previous = p;
            next = n;
        }

        // Getter Methods
        public T getData() {
            return data;
        }
        public Node<T> getPrevious() {
            return previous;
        }
        public Node<T> getNext() {
            return next;
        }

        // Setter Methods
        public void setPrevious(Node<T> p) {
            previous = p;
        }
        public void setNext(Node<T> n) {
            next = n;
        }
    }

    private Node<T> header;   // header sentinel
    private Node<T> trailer;  // trailer sentinel
    private int size = 0;

    // Constructs a new empty list
    public DoublyLinkyList(){
        header = new Node<>(null,null,null);    // a new header
        trailer = new Node<>(null,header,null);    // trailer after the header
        header.setNext(trailer);                        // setting the trailer after the header

    }

    public int size(){ return size;}
    public boolean isEmpty(){ return size == 0;}

    public T first(){
        if(isEmpty())
            return null;
        else
           return header.getNext().getData();
    }

    public T last(){
        if(isEmpty())
            return null;
        else
            return trailer.getPrevious().getData();
    }



}
