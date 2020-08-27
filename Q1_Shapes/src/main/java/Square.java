public class Square extends Shape {

    private double side;
    private double area;
    private String shapeName;
    // constructor

    public Square(String shapeName, double side) {
        super(shapeName);
        this.side = side;
        this.shapeName = shapeName;
        this.area = Math.pow(side, 2);
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
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
                ", shapeName='" + shapeName + '\'' +
                '}';
    }
}