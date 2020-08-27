abstract class Shape {
    private String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;

    }

    @Override
    public String toString() {
        return "Shape{" +
                "shapeName='" + shapeName + '\'' +
                '}';
    }
}