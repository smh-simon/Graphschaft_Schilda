import customDataStructures.graph.TestInput;
import problemImplementations.HistorischeFunde;
import problemImplementations.*;

public class Main {
    public static void main(String[] args) {

        //Winterwege.solve(TestInput.getUndirectedGraph1());
        //Eiszeit.setCover(TestInput.getUndirectedGraph2());
        //AktivitätsDiagramm.solve(TestInput.getDirectedGraph1());
        ProjektAufgaben.projekteZuteilen(TestInput.getFordFulkersonGraph());

        //HistorischeFunde.solve(TestInput.getUndirectedGraph2());
    }
}