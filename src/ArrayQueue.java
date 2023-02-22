//import java.util.Queue;
//
//public class ArrayQueue<E> implements Queue<E> {
//
//    // instance variables
//    private E[] data;        //generic array for storage
//    private int f = 0;       // index of the front element
//    private int sz = 0;      // current no of elements
//
//    // queue constructor
//    public ArrayQueue(){
//        this(CAPACITY);
//    }      // constructs queue with default capacity
//    public ArrayQueue(int CAPACITY){             // constructs queue with given capacity
//        data = (E[]) new Object[CAPACITY];       // safe castinng
//    }
//
//    // methods
//    public int size(){ return sz;}               // returns no of element in the queue
//    public boolean isEmpty(){                    // checks if the queue is empty
//        return (sz == 0);
//    }
//
//    // inserts an element at the rear (i.e. back) of the queue
//    public void enqueue(E e) throws IllegalStateException{
//        if(sz == data.length) throw new IllegalStateException("Queue is full");
//        int avail = (f + sz) % data.length;   // use of modular arithmetic
//        data[avail] = e;
//        sz++;
//    }
//
//    // returns the first element of the queue
//    public E first(){
//        if (isEmpty())
//            return null;
//        return data[f];
//    }
//
//    // removes and returns the first element of the queue
//    public E dequeue(){
//        if(isEmpty())
//            return null;
//        E answer = data[f];
//        data[f] = null;           // deference to help garbage collection
//        f = (f + 1) % data.length;
//        sz--;
//        return answer;
//    }
//
//
//
//
//}
