package Model;

import java.util.ArrayList;

public class Node<T extends Edge> {

    int index;

    ArrayList<T> edges = new ArrayList<T>();

    public Node(int index)
    {
        this.index = index;
    }

    public void connect(T e)
    {
        this.edges.add(e);
    }

    public ArrayList<T> getEdges() {
        return edges;
    }

    public int getIndex() {
        return index;
    }
}
