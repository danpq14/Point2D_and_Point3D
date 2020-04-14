public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint newPoint = new MoveablePoint(0,0);
        newPoint.setDx(10.0);
        newPoint.setDy(12.0);

        newPoint.movePoint();
        newPoint.movePoint();
        newPoint.movePoint();

        System.out.println(newPoint.toString());


    }
}
