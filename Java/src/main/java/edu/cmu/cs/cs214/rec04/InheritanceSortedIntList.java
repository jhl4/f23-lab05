package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList{

    private int totalAddedTimes = 0;

    // Write your implementation below with API documentation

    /**
     * Adds the specified int to the list.
     *
     * @param num an integer to be added to the list
     * Increment totalAddedTimes by 1 if added
     * @return true if the list is changed as a result of the call
     */
    @Override
    public boolean add(int num) {
        boolean result = super.add(num);
        if (result) {
            this.totalAddedTimes++;
        }
        return result;
    }
    
    @Override
    public boolean addAll(IntegerList list) {
        return super.addAll(list);
    }

    public int getTotalAdded() {
        return totalAddedTimes;
    }
}