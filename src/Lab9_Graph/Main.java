package Lab9_Graph;

public class Main {
    public static void main(String[] args) {

        UndirectedUnweightedMatrix matrix = new UndirectedUnweightedMatrix();
        System.out.println(matrix.task_1());

        UndirectedUnweightedList list = new UndirectedUnweightedList();
        System.out.println(list.task_1());

        UndirectedWeightedMatrix matrix2 = new UndirectedWeightedMatrix();
        System.out.println(matrix2.task_2());

        UndirectedWeightedList list2 = new UndirectedWeightedList();
        System.out.println(list2.task_2());

        DirectedWeightedMatrix matrix3 = new DirectedWeightedMatrix();
        System.out.println(matrix3.Task_3A());
        System.out.println(matrix3.Task_3B());
        System.out.println();
        matrix3.print();
        System.out.println();
        matrix3.task_4(matrix3.matrix);
        matrix3.print();
        System.out.println();

        DirectedWeightedList list3 = new DirectedWeightedList();
        System.out.println(list3.task_3A());
        System.out.println(list3.task_3B());
        System.out.println();
        list3.print();
        System.out.println();
        list3.task_4(list3.list);
        list3.print();
    }
}

