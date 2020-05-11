public class RabbitMain
{
    public static void main(String[] beans)
    {
        
        Rabbit cottonEyeJoe = new Rabbit(0,0,0);
        int[][] path = new int[3][3];

        initializePath(path);

        path[0][0] = 1;
    }

    public static void initializePath(int path[][])
    {
        for(int i = 0; i < path.length; i++)
            for(int j = 0; j < path[i].length; j++)
                path[i][j] = 0;
    }
}