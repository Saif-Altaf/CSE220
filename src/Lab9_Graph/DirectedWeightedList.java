package Lab9_Graph;

public class DirectedWeightedList {
    public Edge[] list;

    public DirectedWeightedList() {
        this.list = new Edge[9];

        list[1] = new Edge(1, 2, 4);
        list[1].next = new Edge(1, 3, 3);
        list[1].next.next = new Edge(1, 6, 5);

        list[2] = new Edge(2, 3, 5);
        list[2].next = new Edge(2, 5, 3);
        list[2].next.next = new Edge(2, 8, 3);

        list[3] = new Edge(3, 7, 4);

        list[4] = new Edge(4, 1, 2);
        list[4].next = new Edge(4, 2, 10);
        list[4].next.next = new Edge(4, 5, 3);
        list[4].next.next.next = new Edge(4, 7, 8);
        list[4].next.next.next.next = new Edge(4, 8, 5);

        list[5] = new Edge(5, 3, 2);

        list[6] = new Edge(6, 2, 9);
        list[6].next = new Edge(6, 4, 2);

        list[7] = new Edge(7, 5, 7);

        list[8] = new Edge(8, 6, 4);
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

    //Task #3 for Task #1
    public int task_3A() {
        int maxCount = 0;
        for (int i = 1; i < list.length; i++) {
            int count = 0;
            var temp = list[i];
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }

    //Task #3 for Task #2
    public int task_3B() {
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

    //Task #4
    public void task_4(Edge[] list) {
        for (int i = 1; i < list.length; i++) {
            boolean found = false;
            Edge temp = list[i];
            while (temp != null) {
                Edge index = list[temp.destination];
                while (index.next != null) {
                    if (index.destination == temp.source) {
                        found = true;
                        break;
                    }
                    index = index.next;
                }
                if (found == false) {
                    index.next = new Edge(temp.destination, temp.source, temp.weight);
                }
                temp = temp.next;
            }
        }
    }

    //for checking
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
