import java.util.Random;
import java.util.*;


/*
*  Write a JAVA method that repeatedly selects and removes a random entry
*  from an array until the array holds no more entries.
*
* */

public class Main {
    
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        {cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");}

        removeEntry(cars);
    }

    public static void removeEntry(ArrayList myArray){
        Random random = new Random();            // Generating a random number
        int a;                                   // Temp variable

        while (myArray.size() > 0){
            a = random.nextInt(myArray.size());  // Select random index
            System.out.println(myArray.get(a));  // Print the element to be removed
            myArray.remove(a);                   // Remove element at the index 'a'
            System.out.println(myArray);         // Print the element to be removed
        }
    }

}







