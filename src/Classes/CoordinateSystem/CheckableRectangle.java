package Classes.CoordinateSystem;

public class CheckableRectangle {
    private int topY;
    private int botY;
    private int leftX;
    private int rightX;

    public CheckableRectangle(int topY, int botY, int leftX, int rightX) {
        this.topY = topY;
        this.botY = botY;
        this.leftX = leftX;
        this.rightX = rightX;
    }

    public boolean ContainsPoint(Point point) {
        if (point != null) {
            if (point.getY() <= this.topY && point.getY() >= this.botY
                    && point.getX() >= this.leftX && point.getX() <= this.rightX) {
                return true;
            }
        }
        return false;
    }
}
