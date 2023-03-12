import java.util.Arrays;
import java.util.Queue;

// Implementing the Queue ADT using a fixed length array
public class ArrayQueue<E>{

    // instance variables
    private E[] arrayQueue;
    int indexOfFirstElement = 0;
    int noOfElements = 0;

    // Constructor
    public ArrayQueue(int capacity){
        arrayQueue = (E[]) new Object[capacity];
    }

    // Essential Methods -------------------------

    // Returns the size of the queue
    public int size(){
        return noOfElements;
    }

    // Returns the true if the queue is empty
    public boolean isEmpty(){
        return (noOfElements == 0);
    }

    // Returns the first element of queue without removing it
    public E front(){
        if (isEmpty()) {
            return null;
        }
        return arrayQueue[indexOfFirstElement];
    }

    // Inserts an element at the end of the queue
    public void enqueue(E e) throws IllegalStateException{

        // check if the array is full capacity
        if (noOfElements == arrayQueue.length) {
            throw new IllegalStateException("Queue is full");
        }

        int available = (noOfElements + indexOfFirstElement) % arrayQueue.length;
        arrayQueue[available] = e;
        noOfElements++;
    }

    // Removes and returns the first elements of the queue
    public E dequeue(){
        if (isEmpty()) {
            return null;
        }

        E answer = arrayQueue[indexOfFirstElement];
        arrayQueue[indexOfFirstElement] = null;
        indexOfFirstElement = (indexOfFirstElement + 1) % 10;
        noOfElements--;
        return answer;
    }

}