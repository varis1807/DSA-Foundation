import java.util.*;

public class hashMap {
    public class Node {
        Integer key = null;
        Integer value = null;

        Node(Integer key, Integer value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Node>[] Buckets;
    private int bucketLen = 0;
    private int TotalNoOfNodes = 0;

    // Constructor===============================

    private void initialize(int size) {
        bucketLen = size;
        Buckets = new LinkedList[size];
        for (int i = 0; i < size; i++)
            Buckets[i] = new LinkedList<>();
        TotalNoOfNodes = 0;
    }

    public hashMap() {
        initialize(10);
    }

    // Data Member====================================
    // Basic Funtion==================================

    public int size() {

    }

    public boolean isEmpty() {

    }

    // Exception==================================

    // DS Function================================

    public void put(Integer key, Integer Value) {

    }

    public Integer get(Integer key){

        // if(!containsKey(key)) return null;

        LinkedList<Node> group = getGroup(key);
        int groupSize = group.size();
        Integer res = null;
        while(groupSize-- > 0){
            if( group.getFirst().key == key){
                res = group.getFirst().value;
                break;
            }

            group.addLast(group.removeFirst());
        }
        return res;
    }

    public Integer remove(Integer key){
        LinkedList<Node> group = getGroup(key);
        int groupSize = group.size();
        Integer res = null;
        while(groupSize-- > 0){
            if(group.getFirst().key == key){
                res = group.removeFirst().value;
                this.TotalNoOfNodes--;
                break;
            }
            group.addLast(group.removeFirst());
        }
        return res;
    }

    
    public Integer getOrDefault(Integer key, Integer defVal){
        LinkedList<Node> group = getGroup(key);
        int groupSize = group.size();
        Integer res = defVal;
        while(groupSize-- > 0){
            if( group.getFirst().key == key){
                res = group.getFirst().value;
                break;
            }

            group.addLast(group.removeFirst());
        }
        return res;
    }

    public boolean containsKey(Integer key) {
        LinkedList<Node> group = getGroup(key);
        int gs = group.size();
        boolean res = false;
        while (gs-- > 0) {
            if (group.getFirst().key == key) {
                res = true;
                break;
            }
            group.addLast(group.removeFirst());
        }
        return res;
    }

    private LinkedList<Node> getGroup(Integer key) {
        int hc = getHashCode(key);
        return Buckets[hc];
    }

    private int getHashCode(Integer key) {
        return Math.abs(key.hashCode()) % bucketLen;
    }
}