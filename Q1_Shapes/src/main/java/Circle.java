class Circle extends Shape {
    private double radius;
    private double area;
    private String shapeName;

    public Circle(String shapeName, double radius) {
        super(shapeName);
        this.shapeName = shapeName;
        this.radius = radius;
        this.area = Math.PI * Math.pow(radius, 2);
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", shapeName='" + shapeName + '\'' +
                '}';
    }
}

