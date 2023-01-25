import java.util.Stack;

public class ArrayStack<E> extends Stack<E> {

    public static final int CAPACITY = 1000;  // Default array capacity
    private E[] data;                         // Generic array used for storage
    private int top = -1;                     // index of top element in the stack

    public ArrayStack(){                      // Constructs stack with default capacity
        this(CAPACITY);
    }


    public ArrayStack(int capacity) {         // Constructs stack with given capacity
        data = (E[]) new Object[capacity];
    }

    public int size(){
        return top + 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public E push(E e) throws IllegalStateException{
        if(size() == data.length) throw new IllegalStateException("Stack is full");
        data[++top] = e;
        return e;
    }

    public E top(){
        if (isEmpty()) {
            return null;
        } return data[top];
    }

    public E pop(){
        if (isEmpty()) return null;
        E answer = data[top];
        data[top] = null;
        top--;
        return answer;
    }

}
