public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    private double area;
    private String shapeName;

    // constructor
    public Triangle(String shapeName, double side1, double side2, double side3) {
        super(shapeName);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.shapeName = shapeName;
        this.area = 0.5 * side1 * side2 * Math.sin(side3);
    }

    //getter and setter

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }


    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", area=" + area +
                ", shapeName='" + shapeName + '\'' +
                '}';
    }
}
