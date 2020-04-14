public class MoveablePoint extends Point2D {
    private double x;
    private double y;
    private double dx;
    private double dy;

    public MoveablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MoveablePoint(){

    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    public double getDx() {
        return dx;
    }

    public void setDx(double dx) {
        this.dx = dx;
    }

    public double getDy() {
        return dy;
    }

    public void setDy(double dy) {
        this.dy = dy;
    }

    public void movePoint(){
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
