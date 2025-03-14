package Lab4.HashTable.Task2;

/*You will have to complete the FruitNode Contrustor first
 then within this class you only have to complete two methods
 hashFunction() and insert()
 the rest of the metods are already written
 DO NOT TOUCH any other methods or codes*/
public class HashTable {

    //ht[] :: is the HashTable array that stores the FruitNode objects
    private FruitNode[] ht;

    //Constructor that initializes the HashTable array
    //DO NOT change this Constructor
    public HashTable(int size) {
        this.ht = new FruitNode[size];
    }

    //This method basically prints the HashTable
    //DO NOT change this method
    public void show() {
        for (int i = 0; i < ht.length; i++) {
            System.out.print(i + " ");
            FruitNode n = ht[i];
            while (n != null) {
                System.out.print("('" + n.fruit[0] + "', " + n.fruit[1] + ") --> ");
                n = n.next;
            }
            System.out.println();
        }
    }

    //you need to COMPLETE this method
    private int hashFunction(String key) {
        int sum = 0;
        if (key.length() % 2 == 0) {
            for (int i = 0; i < key.length(); i++) {
                if (i % 2 == 0) {
                    sum += key.charAt(i);
                }
            }
        } else {
            for (int i = 1; i < key.length(); i++) {
                if (i % 2 != 0) {
                    sum += key.charAt(i);
                }
            }
        }
        // TO DO 
        return sum % ht.length; //remove this line
    }

    //you need to COMPLETE this method
    //The insert() method will create a FruitNode using name(Key) & price(value)
    //then inserts it in the proper hashed index
    //If collision occurs resolve using the steps explained in the question
    public void insert(String key, Integer value) {
        FruitNode node = new FruitNode(key, value);
        int index = hashFunction(key);
        if (ht[index] == null) {
            ht[index] = node;
            return;
        }
        FruitNode current = ht[index];
        FruitNode previous = null;
        while (current != null) {
            FruitNode after = current.next;
            if ((int) node.fruit[1] > (int) ht[index].fruit[1]) {
                node.next = ht[index];
                ht[index] = node;
                return;
            }
            else {
                if((int)current.fruit[1])
                current.next=node;
                node.next=after;
                previous=current;
                current=current.next;
            }
        }

    }
    // TO DO
}
