public class Main {

    public static void main(String[] args) {

        char[][]world = new char[][]{
                {'#', '#', '#'},
                {'#', '#', '#'},
                {'#', '#', '#'}};

        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[0].length; j++) {
                world[i][j] = 'H';
            }
        }
        int[] firstInfected = {1, 1};
        codenavirus(world, firstInfected);


    }

    public static int[] codenavirus(char[][] world, int[] firstInfected) {
        firstInfected = new int[]{1, 1};
        int row = firstInfected[0];
        int column = firstInfected[1];
        world[firstInfected[0]][firstInfected[1]] = 'I';


        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[0].length; j++) {
                if (world[row][column + 1] == ('H')) {
                    world[row][column + 1] = 'I';
                } else if (world[row][column + 1] == ('I'))
                    world[row - 1][column] = 'I';
                else if (world[row - 1][column] == ('I'))
                    world[row][column - 1] = 'I';
                else if (world[row][column - 1] ==('I'))
                    world[row + 1][column] = 'I';
            }
        }

        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[0].length; j++) {
                System.out.print(world[i][j] + ", ");
            }
                System.out.println();
        }

    }
    //not finished, got stuck! :(
}
