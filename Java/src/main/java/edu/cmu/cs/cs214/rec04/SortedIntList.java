package edu.cmu.cs.cs214.rec04;

import java.util.ArrayList;
import java.util.Collections;

public class SortedIntList extends AbstractIntList{

    private ArrayList<Integer> data;

    public SortedIntList() {
        this.data = new ArrayList<>();
    }

    public boolean add(int num) {
        boolean result = data.add(num);
        Collections.sort(data);
        return result;
    }
    
    public boolean addAll(IntegerList list) {
        return super.addAll(list);
    }

    public int get(int index) {
        if (index < 0 || index >= data.size()) {
            throw new IndexOutOfBoundsException("Index out of range");
        }

        return data.get(index);
    }

    public boolean remove(int num) {
        return data.remove(Integer.valueOf(num));
    }

    public boolean removeAll(IntegerList list) {
        boolean isModified = false;
        for (int i = 0; i < list.size(); i++) {
            isModified |= data.remove(Integer.valueOf(list.get(i)));
        }
        
        return isModified;
    }

    public int size() {
        return data.size();
    }

}
