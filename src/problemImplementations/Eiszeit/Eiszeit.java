package problemImplementations.Eiszeit;
import customDataStructures.GraphScanner;
import java.util.*;

public class Eiszeit {
    public static void main(String[] args) {
        //ein Referenzattribut der Klasse undirectredGraph wird erstellt, aber noch nicht initialisiert
        undirectedGraph graph;

        //ein neues Objekt der Klasse GraphScanner wird erstellt
        GraphScanner scanner = new GraphScanner();

        //Initialisierung des Referenzattribut graph: scanner.scanGraph() gibt einen Graphen zurück und initalisiert das Referenzatribut graph
        graph = scanner.scanGraph();

        //Ausgabe des Graphen als Matrix und Liste
        System.out.println();
        graph.printAdjacencyMatrix();// Ausgabe des erstellten Graphen als Adjazenzmatrix
        graph.printAdjacencyList();// Ausgabe des erstellten Grahphen als Adjazenzliste

        //Hier wird eine Lite gespeichert, die Elemente des Typs Set<Integer> speichert. Diese enthält die Lösung, die erstellt wird beim Aufrufen der Methode .setCover(graph)
        List<Set<Integer>> solution = SetCover.setCover(graph);

        //Ausgabe der Lösung
        System.out.println("Lösungs Sets: " + solution);
        System.out.println();
        printNodesForEachSet(solution); //Aufruf der Methode printNodesForEachSet
    }

    public static void printNodesForEachSet(List<Set<Integer>> selectedSets) {
        //Ausgabe der Anzahl der Knoten, um alle Kanten abzudecken
        System.out.println("Man benöitgt "+selectedSets.size()+ " Knoten, um alle Kanten abzudecken.");
        System.out.println();
        System.out.println("Hier sind die Knoten mit ihren jeweiligen Kanten, um alle Kanten abzudecken:");
        //for schleife, um für jeden Knoten, der in der solution Liste ist die jeweiligen Kanten auszugeben
        for (int i = 0; i < selectedSets.size(); i++) {
            System.out.println("Knoten "+(i + 1) + " mit folgenden Kanten: " + selectedSets.get(i));
        }
        System.out.println();
    }

}
