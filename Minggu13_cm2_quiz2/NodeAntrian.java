public class NodeAntrian {
    int noAntrian;
    Pelanggan data;
    NodeAntrian next;
    NodeAntrian prev;

    public NodeAntrian(Pelanggan data, NodeAntrian next, NodeAntrian prev, int noAntrian) {
        this.data = data;
        this.next = next;
        this.prev = prev;
        this.noAntrian = noAntrian;
    }
}
