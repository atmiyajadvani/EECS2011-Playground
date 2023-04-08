import java.util.LinkedList;

public class ExampleOfLinkedList
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        int listPointer;
        int ref1;
        int ref2;

        list.add(25);
        list.add(30);
        list.add(45);
        list.add(60);
        list.add(65);
        list.add(80);
        list.add(90);

        listPointer = list.get(0);
        ref1 = list.get(1);
        ref2 = list.get(5);


        System.out.println();
    }
}