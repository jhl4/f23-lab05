# Inheritance and Delegation

This repository is set up for discussion on relative strengths and weaknesses of 
`inheritance` and `delegation` in 17214 23 fall recitation 05.

Lab05 Handout can be found at: [https://github.com/CMU-17-214/f2023/blob/main/labs/lab05.md](https://github.com/CMU-17-214/f2023/blob/main/labs/lab05.md)

Which is more dependent on the implementation details of the SortedIntList, delegation or inheritance?
- In inheritance, since you literally rely on it

If the add method in SortedIntList is significantly modified or its behavior changes, which implementation is more likely to break?
- The delegation implementation since by using inheritance you override the add method in SortedIntList, and no longer rely
on the add function in SortedIntList. 

What issues does using delegation solve that might have been problematic with inheritance?
- Encapsulation and information hiding, as well as increased flexibility if we needed to modify the SortedIntList class

Based on the provided implementations, when would it be more appropriate to use inheritance and when to use delegation?
- It would be more appropriate to use inheritance with the InheritedSortedIntList to inherited from the SortedIntList since the
new inherited IntList is a sortedIntList after all. 
We could use delegation with the AbstractIntList, delegating functionalities of the abstractIntList to the SortedIntList and SortedIntLiinkedList
aka the Strategy Pattern

Inheritance vs. Delegation
-Delegation: We just need to look at specification, can basically assume the sortedIntList class works.
-Inheritance: Since we extend from SortedIntList and we add functionality on top of it, we need to know the implementation of SortedIntList
By extending/inheriting, we modify the existing SortedIntList class.
By delegation, we simply use the existing functionality of the SortedIntList class without modifying it