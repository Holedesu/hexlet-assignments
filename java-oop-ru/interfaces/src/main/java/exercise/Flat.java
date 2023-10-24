package exercise;

// BEGIN
class Flat implements Home {
    private double area;
    private double balconyArea;
    private int floor;

    public Flat() {
    }

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getArea() {
        return area + balconyArea;
    }

    public int compareTo(Home another) {
        return Double.compare(this.area, another.getArea());
    }

    public String toString(){
        return "Квартира площадью "+ getArea() + " метров на " + floor + " этаже";
    }
}
// END
