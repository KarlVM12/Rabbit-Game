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

    public static void stageOne(int path[][])
    {
        /* Stage 1 Path on a 3x3
          { {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1} } 
        */
        forwardPath(path, 3, 0);
        setOneBlockOnPath(path, 1, 0);
        setOneBlockOnPath(path, 1, 2);
        forwardPath(path, 3, 2);
    }

    public static void setOneBlockOnPath(int path[][], int row, int column)
    {
        path[row][column] = 1;
    }

    public static void forwardPath(int path[][], int amntOfSpaces, int row)
    {
        for (int i = 0; i < amntOfSpaces; i++)
            setOneBlockOnPath(path, row, i);
    }

    public static void printPath(int path[][])
    {
        for (int i = 0; i < path.length; i++)
        {
            for (int j = 0; j < path[j].length; j++)
                System.out.print(path[i][j] + " ");
            
            System.out.println();
        }
    }

}