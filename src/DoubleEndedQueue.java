
// Deque allows insertion and deletion at both the front and the end of the queue.
public class DoubleEndedQueue<E> {

    private E[] arrayQueue;
    int indexOfFirstElement = 0;
    int indexOfLastElement = 0;
    int noOfElements = 0;

    // Constructor
    public DoubleEndedQueue(int capacity){
        arrayQueue = (E[]) new Object[capacity];
    }

    // Essential Methods -------------------------

    // Inserts a new element in the front of the deque
    public void addFirst(E e) throws IllegalStateException{
        // check if the array is full capacity
        if (noOfElements == arrayQueue.length) {
            throw new IllegalStateException("Queue is full");
        }

        int available = (noOfElements + indexOfLastElement) % arrayQueue.length;
        arrayQueue[available] = e;
        noOfElements++;

    }

    // Inserts a new element in the end of the deque
    public void addLast(E e) throws IllegalStateException{
        // check if the array is full capacity
        if (noOfElements == arrayQueue.length) {
            throw new IllegalStateException("Queue is full");
        }

        int available = (noOfElements + indexOfFirstElement) % arrayQueue.length;
        arrayQueue[available] = e;
        noOfElements++;
    }

    // Removes and returns the first element of the deque
    public E removeFirst(){
        if (isEmpty()) {
            return null;
        }

        E answer = arrayQueue[indexOfFirstElement];
        arrayQueue[indexOfFirstElement] = null;
        indexOfFirstElement = (indexOfFirstElement + 1) % 10;
        noOfElements--;
        return answer;
    }

    // Removes and returns the last element of the deque
    public E removeLast(){
        if (isEmpty()) {
            return null;
        }

        E answer = arrayQueue[indexOfLastElement];
        arrayQueue[indexOfLastElement] = null;
        indexOfLastElement = (indexOfLastElement + 1) % 10;
        noOfElements--;
        return answer;
    }

    // Returns the first element of the deque without removing it
    public E first(){
        if (isEmpty()) {
            return null;
        }
        return arrayQueue[indexOfFirstElement];
    }

    // Returns the last element of the deque without removing it
    public E last(){
        if (isEmpty()) {
            return null;
        }
        return arrayQueue[indexOfLastElement];
    }

    // Returns the size of the queue
    public int size(){
        return noOfElements;
    }

    // Returns the true if the queue is empty
    public boolean isEmpty(){
        return (noOfElements == 0);
    }



}
