public class Test {
    public static void main(String[] args) {
        Shape s =new Triangle(3,5,8);
        Shape s1 = new Square(4);
        Shape s2 = new Circle(9.9);
        Shape s3 = new Rectangle(6,9);
        System.out.println(s.toString());
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

    }
}
