package exercise;

// BEGIN
class Cottage implements Home {
    private double area;
    private int floorCount;

    public Cottage() {
    }

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public double getArea() {
        return area;
    }

    public int compareTo(Home another) {
        return Double.compare(this.area, another.getArea());
    }

    public String toString() {
        return floorCount + " этажный коттедж площадью " + getArea() + " метров";
    }
}
// END
