public class RabbitMain
{
    public static void main(String[] beans)
    {
        
        Rabbit cottonEyeJoe = new Rabbit(0,0,0);
        int[][] path = new int[3][3];

        initializePath(path);

    }

    public static void initializePath(int path[][])
    {
        for(int i = 0; i < path.length; i++)
            for(int j = 0; j < path[i].length; j++)
                path[i][j] = 0;
    }
    
    public static void setOneBlockOnPath(int path[][], int row, int column)
    {
        path[row][column] = 1;
    }

}