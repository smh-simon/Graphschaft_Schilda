package customDataStructures.graph;

public class TestInput {

    public static int[][] getUndirectedGraph1(){
        int[][] graphArr = new int[][]{
                {0, 10, 0, 0, 0, 15},
                {10, 0, 10, 0, 3, 0},
                {0, 10, 0, 20, 0, 0},
                {0, 0, 20, 0, 7, 0},
                {0, 3, 0, 7, 0, 4},
                {15, 0, 0, 0, 4, 0}
        };
        return graphArr;
    }



    public static int[][] getDirectedGraph1(){
        int[][] graphArr = new int[][]{
                {0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0}
        };
        return graphArr;
    }


    public static int[][] getDirectedGraph2(){
        int[][] graphArr = new int[][]{
                {0, 7, 0, 2, 0, 4},
                {7, 0, 1, 0, 0, 0},
                {0, 1, 0, 5, 0, 0},
                {2, 0, 5, 0, 10, 1},
                {0, 0, 0, 10, 0, 5},
                {4, 0, 0, 1, 5, 0}
        };
        return graphArr;
    }



    public static int[][] getKompetenzenmatrix(){
        int[][] kompetenzenMatrix = {
                {1, 0, 1, 1, 0, 1},
                {0, 1, 1, 0, 1, 1},
                {1, 1, 1, 0, 1 , 1},
                {0, 1, 0, 1, 0 , 1},
                {0, 0, 1, 0, 1 , 0},
                {1, 0, 1, 1, 0, 1}
        };
        return kompetenzenMatrix;
    }
    public static int[] getmitarbeiterProProjekt(){
        int[] array = {2, 1, 4, 1, 2, 2};
        return array;
    }
}

/*
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
 */
