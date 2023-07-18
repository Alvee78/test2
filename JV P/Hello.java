public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Box box1;
        box1 = new Box();
        box1.setHeight(2);
        box1.setLength(4);
        box1.setWidth(5);
        System.out.println(box1.getArea());

    }
}