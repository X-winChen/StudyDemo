/**
 * @Author: Chenxy
 * @Date: ${DATE}  ${TIME}
 * @Version 1.0
 */


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Rectangle rectangle=new Square(5);
        System.out.printf(String.valueOf(rectangle.area()));
    }
}