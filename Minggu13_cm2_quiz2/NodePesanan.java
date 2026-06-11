public class NodePesanan {
    Pesanan data;
    NodePesanan next;
    NodePesanan prev;

    public NodePesanan(Pesanan data, NodePesanan next, NodePesanan prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
