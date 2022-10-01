package Model;

public class Edge<T extends Node> {

    T from, to;

    public Edge(T from, T to)
    {
        this.from = from;
        this.to = to;
    }

    public T getFrom() {
        return from;
    }

    public T getTo() {
        return to;
    }
}
