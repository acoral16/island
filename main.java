public class main {

    public static void main(String[] args) {
        int grid1[][] = {
                { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                { 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
                { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 }
        };
        int grid2[][] = { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1 }, { 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
                { 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1 }, { 0, 1, 0, 0
                , 1, 1, 0, 0, 0, 1, 0, 0, 1 }, { 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };
        int grid3[][] = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0
                , 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
        System.out.println("Is test case 1 passing? " + (maxAreaOfIsland(grid1) == 6));
//        System.out.println("Is test case 2 passing? " + (maxAreaOfIsland(grid2) == 12));
//        System.out.println("Is test case 3 passing? " + (maxAreaOfIsland(grid2) == 0));
    }

    public static int maxAreaOfIsland(int[][] grid) {
        Integer area = 0;

        int x = 0,y = 0;
        return getArea(grid, x, y, area);
    }

    public static int getArea(int[][] grid, int x, int y, Integer area){
        if(x >= 0 && x <= grid[x].length &&
        y >= 0 && y <= grid.length){
            if(y == grid.length && x == grid[x].length)
                return area;
            if(grid[x][y] == 1)
                area++;
            if(x == grid[x].length)
                x = 0;
            if(y == grid.length)
                y = 0;

            return getArea(grid, x++, y, area);
        }
        return area;
    }
}
