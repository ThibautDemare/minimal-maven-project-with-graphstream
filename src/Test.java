public class Test {
        public static void main(String... args){
                org.graphstream.graph.Graph g = new org.graphstream.graph.implementations.SingleGraph("ok");
                g.addNode("A");
                g.addNode("B");
                g.addEdge("AB", "A", "B");
                System.out.println("Minimal GraphStream Test. \nA single graph with " + g.getNodeCount() + " nodes and "+ g.getEdgeCount()+" edge.");
        }
}
