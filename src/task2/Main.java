package task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(20);
        Set<Integer> set2 = new HashSet<>(20);
        Random random = new Random();
        int i = 0;
        while (set1.size() < 20) {
            set1.add(random.nextInt(1000));
            i++;
        }
        System.out.println(set1);

//        for (Integer set: set1){
//            if (set%2==0){
//             set2.add(set);
//            }
//            set1=set2;
        Iterator<Integer> iterator = set1.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(set1);
    }


}

