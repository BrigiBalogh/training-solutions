package interfaceextends.robot;

import java.util.List;

public class C3P0  implements MoveableRobot {

    private Point position;
    private int angle;
    private List<Point> path;

    public C3P0(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    @Override
    public List<Point> getPath() {
        return path;
    }

    @Override
    public void moveTo(Point position) {
        walkTo(position);
    }

    @Override
    public void fastMoveTo(Point position) {
        walkTo(position);

    }

    @Override
    public void rotate(int angle) {
        this.angle = angle;
    }

    private void walkTo(Point position) {
        path.add(position);
        this.position = position;
    }
}
