package fc.java.course2.part2;


import fc.java.model2.MathOperation;

public class FunctionalInterfaceTest1 {
    public static void main(String[] args) {
        MathOperation mo = new MathOperationImpl();
        int result = mo.operation(10, 20);
        System.out.println("result = " + result);
    }
}
