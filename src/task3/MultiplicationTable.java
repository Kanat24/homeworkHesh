package task3;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MultiplicationTable {
    private static final Set<Task1> set = new HashSet<>();

    public static void main(String[] args)
    {
        Random random = new Random();
        while(set.size()<15){
            set.add(new Task1(random.nextInt(8)+2 , random.nextInt(8)+2 ));
        }
        System.out.println(set);
    }

}
