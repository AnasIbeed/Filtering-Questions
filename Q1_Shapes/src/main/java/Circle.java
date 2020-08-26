class Circle extends Shape {
    private double radius;
    private double area;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
        this.area = Math.PI * Math.pow(radius, 2);
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
                '}';
    }
}

