package treesAndGraphs;

public class Node {
    public String name;
    public Node[] children;
    public State state;

    public Node(int i) {
    }

    enum State {Unvisited, Visited, Visiting;}

    Node[] getAdjacents() {
        return children;
    }
}

