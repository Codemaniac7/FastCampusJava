package fc.java.course2.part1;

public class StringManipulation {
    public static void main(String[] args) {
        // HelloWorld라는 문자열을 생성하세요
        int a =10;

        String str ="HelloWorld";
        System.out.println(str.charAt(1));
        System.out.println(str.replaceAll("o","X")); // HellXWXrld
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(5,8));
        System.out.println(str.indexOf("Wr"));
        for(int i=0; i<str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
