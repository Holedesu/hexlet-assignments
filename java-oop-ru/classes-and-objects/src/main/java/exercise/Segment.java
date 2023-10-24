package exercise;

// BEGIN
class Segment {
    private Point beginPoint;
    private Point endPoint;

    public Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public Point getBeginPoint(){ return beginPoint; }

    public Point getEndPoint() { return endPoint; }

    public Point getMidPoint() {
        Point newPoint = new Point();

        int middleBeginPoint = (beginPoint.getX() + endPoint.getX()) / 2;
        int middleEndPoint = (beginPoint.getY() + endPoint.getY()) / 2;

        newPoint.setX(middleBeginPoint);
        newPoint.setY(middleEndPoint);

        return newPoint;
    }
}
// END
