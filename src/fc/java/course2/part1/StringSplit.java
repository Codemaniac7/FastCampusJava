package fc.java.course2.part1;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
//        String str = "Hello,World,Java";
//        String str = "Hello   World Java";
//        String strArray[]=str.split(",");
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하세요.");
        String str = scanner.nextLine();
        String[] strArray = str.split("\\s+");

        for(String s : strArray) {
            System.out.println(s.toString());
        }
    }
}
