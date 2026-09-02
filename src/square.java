public record square(double side) implements GeometricArea{
    @Override
    public double getArea() {
        return side*side;
    }
}
