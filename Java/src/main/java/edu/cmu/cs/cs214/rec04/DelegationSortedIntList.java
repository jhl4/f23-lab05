package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList {
    // Write your implementation below with API documentation

    private SortedIntList sList;
    private int totalAdded;

    public DelegationSortedIntList() {
        this.sList = new SortedIntList();
        this.totalAdded = 0;
    }

    public boolean add(int num) {
       boolean result = sList.add(num);
       if (result) {
            totalAdded++;
       }
       return result;
    }

    public boolean addAll(IntegerList list) {
        totalAdded += list.size();
        return sList.addAll(list);
        
    }

    public int get(int index) {
        return sList.get(index);
    }

    public boolean remove(int num) {
       return sList.remove(num);
    }

    public boolean removeAll(IntegerList list) {
        return sList.removeAll(list);
    }

    public int size() {
        return sList.size();
    }

    public int getTotalAdded() {
        return totalAdded;
    }

    

}