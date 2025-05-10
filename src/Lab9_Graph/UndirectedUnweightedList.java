package Lab9_Graph;

public class UndirectedUnweightedList {
    private Edge[] list;

    public UndirectedUnweightedList() {
        this.list = new Edge[9];
        list[1] = new Edge(1, 2);
        list[2] = new Edge(2, 1);
        list[3] = new Edge(3, 1);
        list[4] = new Edge(4, 1);
        list[5] = new Edge(5, 2);
        list[6] = new Edge(6, 1);
        list[7] = new Edge(7, 3);
        list[8] = new Edge(8, 2);

        list[1].next = new Edge(1, 3);
        list[1].next.next = new Edge(1, 4);
        list[1].next.next.next = new Edge(1, 6);

        list[2].next = new Edge(2, 3);
        list[2].next.next = new Edge(2, 4);
        list[2].next.next.next = new Edge(2, 5);
        list[2].next.next.next.next = new Edge(2, 6);
        list[2].next.next.next.next.next = new Edge(2, 8);

        list[3].next = new Edge(3, 2);
        list[3].next.next = new Edge(3, 5);
        list[3].next.next.next = new Edge(3, 7);

        list[4].next = new Edge(4, 2);
        list[4].next.next = new Edge(4, 5);
        list[4].next.next.next = new Edge(4, 6);
        list[4].next.next.next.next = new Edge(4, 7);
        list[4].next.next.next.next.next = new Edge(4, 8);

        list[5].next = new Edge(5, 3);
        list[5].next.next = new Edge(5, 4);
        list[5].next.next.next = new Edge(5, 7);

        list[6].next = new Edge(6, 2);
        list[6].next.next = new Edge(6, 4);
        list[6].next.next.next = new Edge(6, 8);

        list[7].next = new Edge(7, 4);
        list[7].next.next = new Edge(7, 5);

        list[8].next = new Edge(8, 4);
        list[8].next.next = new Edge(8, 6);

    }

    private class Edge {
        int source;
        int destination;
        Edge next;

        public Edge(int source, int destination) {
            this.source = source;
            this.destination = destination;
        }
    }

    public int task_1() {
        int maxCount = 0;
        for (int i = 1; i < list.length; i++) {
            int count = 0;
            Edge temp = list[i];
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}
