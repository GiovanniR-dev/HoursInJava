public record Rectangle(double heigh, double base ) implements GeometricArea {
    @Override
    public double getArea() {
        return heigh*base;
    }
}
