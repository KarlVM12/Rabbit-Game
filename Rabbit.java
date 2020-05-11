public class Rabbit
{
    private int coordX, coordY;
    private int orientation = 0; // in degrees of unit circle
    private int movementSpeed = 1;

    public Rabbit(int startX, int startY, int startOrientation)
    {
        this.coordX = startX;
        this.coordY = startY;
        this.orientation = startOrientation;
    }

    public void updateX(int value)
    {
        this.coordX = value;
    }

    public void updateY(int value)
    {
        this.coordY = value;
    }

    public void moveForward()
    {
        this.coordX += this.movementSpeed;
    }

    public void changeOrientation()
    {
        this.orientation += 90;
    }

    public int getCoordX()
    {
        return this.coordX;
    }

    public int getCoordY()
    {
        return this.coordY;
    }

}