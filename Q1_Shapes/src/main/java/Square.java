public class Square extends Shape {

    private double side;
    private double area;

    // constructor
    public Square(double side) {
        super("Square");
        this.side = side;
        this.area = Math.pow(side, 2);

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + area +
                '}';
    }
}