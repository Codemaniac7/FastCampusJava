package fc.java.course2.part2;

import java.util.ArrayList;

public class CollectionBasic {
    public static void main(String[] args) {
        // ArrayList에 10,20,30,40,50 5개의 정수(int)를 저장하고 출력하세요.
        // ArrayList -> Object[] <--X-- int
        // ArrayList -> Object[] <----- Integer(Wrapper)
        // ArrayList -> Object[] <--(Auto-boxing:Integer)-- int
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // new Integer(10)
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        //  int<-(auto-unboxing)<-Integer
        for(int data: list) {
            System.out.println(data);
        }

    }
}
