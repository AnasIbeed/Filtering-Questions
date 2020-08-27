class Rectangle extends Shape {
    private double width;
    private double height;
    private double area;
    private String shapeName;

    public Rectangle(String shapeName, double width, double height) {
        super(shapeName);
        this.width = width;
        this.height = height;
        this.area=width*height;
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + area +
                ", shapeName='" + shapeName + '\'' +
                '}';
    }
}