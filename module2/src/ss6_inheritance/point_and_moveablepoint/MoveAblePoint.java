package ss6_inheritance.point_and_moveablepoint;

public class MoveAblePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;


    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveAblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveAblePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr1 = new float[2];
        arr1[0] = getXSpeed();
        arr1[1] = getYSpeed();
        return arr1;
    }

    public MoveAblePoint move() {
        x = x + xSpeed;
        y = y + ySpeed;
        return this;
    }

    @Override
    public String toString() {
        return "MoveAblePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", x=" + x +
                ", y=" + y +

                '}';
    }
}
