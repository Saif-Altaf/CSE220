package Lab9_Graph;

public class UndirectedWeightedList {
    private Edge[] list;

    public UndirectedWeightedList() {
        this.list = new Edge[9];
        list[1] = new Edge(1, 2, 4);
        list[2] = new Edge(2, 1, 4);
        list[3] = new Edge(3, 1, 3);
        list[4] = new Edge(4, 1, 2);
        list[5] = new Edge(5, 2, 3);
        list[6] = new Edge(6, 1, 5);
        list[7] = new Edge(7, 3, 4);
        list[8] = new Edge(8, 2, 3);
        list[1].next = new Edge(1, 3, 3);
        list[1].next.next = new Edge(1, 4, 2);
        list[1].next.next.next = new Edge(1, 6, 5);

        list[2].next = new Edge(2, 3, 5);
        list[2].next.next = new Edge(2, 4, 10);
        list[2].next.next.next = new Edge(2, 5, 3);
        list[2].next.next.next.next = new Edge(2, 6, 9);
        list[2].next.next.next.next.next = new Edge(2, 8, 3);

        list[3].next = new Edge(3, 2, 5);
        list[3].next.next = new Edge(3, 5, 2);
        list[3].next.next.next = new Edge(3, 7, 4);

        list[4].next = new Edge(4, 2, 10);
        list[4].next.next = new Edge(4, 5, 3);
        list[4].next.next.next = new Edge(4, 6, 2);
        list[4].next.next.next.next = new Edge(4, 7, 8);
        list[4].next.next.next.next.next = new Edge(4, 8, 5);

        list[5].next = new Edge(5, 3, 2);
        list[5].next.next = new Edge(5, 4, 6);
        list[5].next.next.next = new Edge(5, 7, 7);

        list[6].next = new Edge(6, 2, 9);
        list[6].next.next = new Edge(6, 4, 2);
        list[6].next.next.next = new Edge(6, 8, 4);

        list[7].next = new Edge(7, 4, 8);
        list[7].next.next = new Edge(7, 5, 7);

        list[8].next = new Edge(8, 4, 5);
        list[8].next.next = new Edge(8, 6, 4);

    }

    private class Edge {
        int source;
        int destination;
        int weight;
        Edge next;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    public int task_2() {
        var maxWeight = 0;
        var heavyVertex = 0;
        for (int i = 1; i < list.length; i++) {
            var temp = list[i];
            var sum = 0;
            while (temp != null) {
                sum += temp.weight;
                temp = temp.next;
            }
            if (sum > maxWeight) {
                heavyVertex = i;
                maxWeight = sum;
            }
        }
        return heavyVertex;
    }

//for checking purpose
    public void print() {
        for (int i = 1; i < list.length; i++) {
            Edge temp = list[i];
            System.out.print(i + ": ");
            while (temp != null) {
                System.out.print("[" + temp.source + ", " + temp.destination + ", " + temp.weight + "]" + "-> ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
