package treesAndGraphs;

import java.util.LinkedList;

public class RouteBetweenNodes {

    boolean search(Graph g, Node start, Node end) {
        if (start == end) return true;

        LinkedList<Node> q = new LinkedList<Node>();

        for (Node u : g.getNodes()) {
            u.state = Node.State.Unvisited;
        }
        start.state = Node.State.Visiting;
        q.add(start);
        Node u;
        while (!q.isEmpty()) {
            u = q.removeFirst();
            if (u != null) {
                for (Node v : u.getAdjacents()) {
                    if (v.state == Node.State.Unvisited) {
                        if (v == end) {
                            return true;
                        } else {
                            v.state = Node.State.Visiting;
                            q.add(v);
                        }
                    }
                }
                u.state = Node.State.Visited;
            }
        }

        return false;
    }

}
