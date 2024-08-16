package fc.java.course2.part2;

public class WrapperTest {
    public static void main(String[] args) {
        // 정수형 변수에 10을 저장하세요
        int a = 10;
//        Integer aa = new Integer(10) // 사용자 정의 자료형;
        Integer aa = 10; //Auto-boxing
        System.out.println(aa.intValue()); // Unboxing(Integer->int)

        Integer bb = 20;
        int b = bb;

        float f = 10.5f;
//        Float ff = new Float(10.5f);
        Float ff = 45.6f;
        ff.floatValue();

        Float af = 49.1f;
        float aff = af;
        System.out.println(aff);
    }
}
