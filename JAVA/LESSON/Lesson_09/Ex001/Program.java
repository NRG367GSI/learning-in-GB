package Lesson_09.Ex001;

import java.util.Iterator;

public class Program {
    public static void main(String[] args) {

        // List<Integer> nums = new ArrayList<>();
        // nums.add(1);
        // nums.add(12);
        // nums.add(123);
        // nums.add(1234);
        // nums.add(12345);

        // Iterator<Integer> iter = nums.iterator();
        // while (iter.hasNext()) {
        //     System.out.println(iter.next());
        // }

        Worker worker = new Worker(
            "Имя", "Фамилия", 23, 4567);

        
        Iterator<Object> iter = worker.iterator();
        while (iter.hasNext()) {
             System.out.println(iter.next());
        }

        
    }
}
