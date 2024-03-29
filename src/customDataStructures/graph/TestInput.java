package customDataStructures.graph;

public class TestInput {

    public static int[][] HistorischeFunde_TestGraph(){
        return new int[][]{
                {0, 4, 2, 1, 0, 0},
                {4, 0, 0, 0, 3, 0},
                {2, 0, 0, 0, 0, 3},
                {1, 0, 0, 0, 2, 0},
                {0, 3, 0, 2, 0, 3},
                {0, 0, 3, 0, 3, 0}
        };
    }

    public static int[][] Winterwege_TestGraph(){
        return HistorischeFunde_TestGraph();
    }

    public static int[][] Aktivitaetsdiagramm_TestGraph(){
        return new int[][]{
                {0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0},
                {0, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0}
        };
    }

    public static int[][] Bierlieferung_TestGraph(){
        return new int[][]{
                {0, 7, 0, 4, 10, 0},
                {0, 0, 1, 0, 0, 3},
                {0, 0, 0, 0, 0, 2},
                {0, 0, 3, 0, 0, 7},
                {0, 0, 0, 12, 0, 4},
                {0, 0, 0, 0, 0, 0}
        };
    }

    public static int[][] ProjektAufgaben_TestGraph(){
        return new int[][]{
                {0, 3, 3, 3, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
    }

    public static int[][] Eiszeit_TestGraph(){
        return new int[][]{
                {0, 1, 1, 0, 0, 1},
                {1, 0, 1, 0, 1, 0},
                {1, 1, 0, 1, 0, 0},
                {0, 0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1},
                {1, 0, 0, 0, 1, 0}
        };
    }

    public static int[][] Empfehlungssystem_TestGraph(){
        return new int[][]{
                {0, 10, 4, 0, 0, 2},
                {10, 0, 4, 0, 3, 0},
                {4, 4, 0, 11, 0, 0},
                {0, 0, 11, 0, 2, 0},
                {0, 3, 0, 2, 0, 6},
                {2, 0, 0, 0, 6, 0}
        };
    }



    public static int[][] getUndirectedGraph1(){
        return new int[][]{
                {0, 10, 0, 0, 0, 15},
                {10, 0, 10, 0, 3, 0},
                {0, 10, 0, 20, 0, 0},
                {0, 0, 20, 0, 7, 0},
                {0, 3, 0, 7, 0, 4},
                {15, 0, 0, 0, 4, 0}
        };
    }

    public static int[][] getUndirectedGraph2(){
        return new int[][]{
                {0, 7, 0, 2, 0, 4}, //Vertex 0 has connection to Vertex 1 with weight 7, Vertex 3 with weight 2 ...
                {7, 0, 1, 0, 0, 0}, //Vertex 1 has connection to Vertex 0 with weight 7 ....
                {0, 1, 0, 5, 0, 0},
                {2, 0, 5, 0, 10, 1},
                {0, 0, 0, 10, 0, 5},
                {4, 0, 0, 1, 5, 0}
        };
    }

    public static int[][] getFordFulkersonGraph(){
        return new int[][]{
                {0, 3, 3, 3, 0, 0, 3, 0, 0, 0}, //Vertex 0 has connection to Vertex 1 with weight 7, Vertex 3 with weight 2 ...
                {0, 0, 0, 0, 1, 1, 0, 1, 1, 0}, //Vertex 1 has connection to Vertex 0 with weight 7 ....
                {0, 0, 0, 0, 1, 1, 0, 1, 1, 0},
                {0, 0, 0, 0, 1, 1, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        };
    }



    public static int[][] getDirectedGraph1(){
        return new int[][]{
                {0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0}
        };
    }










    public static int[][] getUndirectedGraph4(){
        return new int[][]{
                {1,0,1,1,1,0,1},
                {0,1,1,1,0,0,1},
                {1,1,0,1,0,1,0},
                {1,1,1,1,0,0,1},
                {1,0,1,0,1,1,0},
                {0,0,1,0,1,1,0},
                {1,1,1,1,0,0,1}
                };
    }

    public static int[][] getUndirectedGraph3(){
        return new int[][]{
                {1,1,1,0},
                {1,1,1,1},
                {1,1,1,1},
                {0,1,1,1}
        };
}

    public static int[][] getUndirectedGraph5() {
        return new int[][]{
                {0, 1, 0, 0, 1, 0, 0, 0, 0, 0},
                {1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {1, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0}
        };
    }

    public static int[][] getDirectedGraph4() {
        return new int[][]{
                {0, 1, 0, 0, 2, 0, 0, 0, 0, 0},
                {0, 0, 3, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 4, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 5, 0, 0},
                {0, 0, 0, 0, 0, 6, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 7, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 8},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 9},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
    }

    public static int[][] getDirectedGraph3() {
        return new int[][]{
                {0, 1, 0, 0, 2, 0, 0},
                {0, 0, 3, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 4},
                {0, 0, 0, 0, 5, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 6, 0}
        };
    }

    public static int[][] directedGewichtet2() {
        return new int[][]{
                {0, 1, 0, 0, 2, 0, 0, 0, 0, 0},
                {1, 0, 3, 0, 0, 0, 0, 0, 0, 0},
                {0, 3, 0, 0, 0, 0, 4, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 5, 0, 0},
                {2, 0, 0, 0, 0, 6, 0, 0, 0, 0},
                {0, 0, 0, 0, 6, 0, 0, 0, 0, 0},
                {0, 0, 4, 0, 0, 0, 0, 0, 7, 0},
                {0, 0, 0, 5, 0, 0, 0, 0, 0, 8},
                {0, 0, 0, 0, 0, 0, 7, 0, 0, 9},
                {0, 0, 0, 0, 0, 0, 0, 8, 9, 0}
        };
    }

    public static int[][] directedGewichtet1() {
        return new int[][]{
                {0, 1, 0, 0, 2, 0, 0},
                {0, 0, 3, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 4},
                {0, 0, 0, 0, 5, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 6, 0}
        };
    }

    public static int[][] UndirectedGewichtet1() {
        return new int[][]{
                {0, 1, 0, 0, 2, 0, 0},
                {1, 0, 3, 0, 0, 0, 0},
                {0, 3, 0, 0, 0, 0, 4},
                {0, 0, 0, 0, 5, 0, 0},
                {2, 0, 0, 5, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 4, 0, 0, 0, 0}
        };
    }

    public static int[][] UndirectedGewichtet2() {
        return new int[][]{
                {0, 1, 0, 0, 2, 0, 0, 0, 0, 0},
                {1, 0, 3, 0, 0, 0, 0, 0, 0, 0},
                {0, 3, 0, 0, 0, 0, 4, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 5, 0, 0},
                {2, 0, 0, 0, 0, 6, 0, 0, 0, 0},
                {0, 0, 0, 0, 6, 0, 0, 0, 0, 0},
                {0, 0, 4, 0, 0, 0, 0, 0, 7, 0},
                {0, 0, 0, 5, 0, 0, 0, 0, 0, 8},
                {0, 0, 0, 0, 0, 0, 7, 0, 0, 9},
                {0, 0, 0, 0, 0, 0, 0, 8, 9, 0}
        };
    }
}

/*
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}


    }
 */
