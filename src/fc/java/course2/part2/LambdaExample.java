package fc.java.course2.part2;

import fc.java.model2.MathOperation;

public class LambdaExample {
    public static void main(String[] args) {
        // 람다식: 코드를 간결, 확장, 구현이 쉽다
        MathOperation add = (x, y) -> x+y;
        MathOperation multi = (x, y) -> x*y;
        int result = add.operation(10, 20);
        int mulResult = multi.operation(10, 20);
        System.out.println("result = " + result);
        System.out.println("mulResult = " + mulResult);
    }
}
