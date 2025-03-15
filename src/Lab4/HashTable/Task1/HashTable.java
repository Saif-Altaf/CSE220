package Lab4.HashTable.Task1;
/*You will have to complete the PairNode Contrustor first
 then within this class you only have to complete two methods
 hashFunction() and searchHashtable()
 the rest of the metods are already written
 DO NOT TOUCH any other methods or codes*/
public class HashTable {

    //ht[] :: is the HashTable array that stores the PairNode objects
    private PairNode[] ht;

    //Constructor that initializes the HashTable array
	//DO NOT change this Constructor
    public HashTable(int size){
        this.ht = new PairNode[size];
    }

    //This method is called to insert each pair from the 2D Array
	//DO NOT change this method
    public void createFromArray(Object[][] arr){
        for( Object[] x: arr )
            this.insert( x );
    }

    //The insert() method inserts the pair into proper Hashed Index
	//This method is already written including collision resolve using Forward Chaining
    //DO NOT change this method
    public void insert(Object[] keyValuePair){
        String key = (String)keyValuePair[0];
        Integer value = (Integer)keyValuePair[1];
        String srchResult = this.searchHashtable(keyValuePair);
        if ( srchResult==null ) {
            System.out.println("Incomplete searchHashTable() and hashFunction() method");
        } else if ( srchResult.equals( "Found" ) ){
            System.out.println("("+key+","+value+") already Inserted. Cannot reinsert.");
        } else {
            int hashedIndex = this.hashFunction( key );
            PairNode newPNode = new PairNode( key, value );
            if ( this.ht[hashedIndex] == null ){
                this.ht[hashedIndex] = newPNode;
            } else {
                newPNode.next = this.ht[hashedIndex];
                this.ht[hashedIndex] = newPNode;
            }
        }
    }

    //This method basically prints the HashTable
    //DO NOT change this method
    public void printHashTable(){
        for(int i=0; i<ht.length; i++){
            System.out.print( i+" : " );
            PairNode pNode = ht[i];
            if( pNode==null ) System.out.println("null");
            while (pNode!=null){
                System.out.print("(Key: "+pNode.key+", Value: "+pNode.value+") --> ");
                if (pNode.next==null) System.out.println("null");
                pNode = pNode.next;
            }
        }
    }

	//you need to COMPLETE this method
    private int hashFunction( String key ){
//his instance method takes a key-value pair (string, int), calculates the hashed index on key and returns the index.
// This hash function takes consecutive two letters of the key string, concatenates their ascii values into an integer
// and sums all the concatenated integers. Then it finds out the modulus of the summation (think for yourself with which
// number should we mod the summation) as the hashed index.
//For instance, for a string ‘Mortis’, the consecutive two letters are Mo, rt, is. The concatenated integer for
//Mo is 77111 (Ascii of M is 77, o is 111);
//rt is 114116 (Ascii of r is 114, t is 116);
//‘is’ is 105115 (Ascii of i is 105, s is 115).
//The  summation is = 77111+114116+105115
//Mod the summation with ___ and return the answer as the hashed index.
        // TO DO !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        return Math.abs(key.hashCode())%ht.length; //remove this line
    }


	//you need to COMPLETE this method
    //Hint: you may need to use Integer.parseInt() to convert from String to Integer
    public String searchHashtable( Object[] keyValuePair ){
        // TO DO !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        var key=(String) keyValuePair[0];
        int index = hashFunction(key);
        PairNode current = ht[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return "Found";
            }
            current = current.next;
        }
        return "Not Found"; // remove this line
    }

}
