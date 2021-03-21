package com.seanhu93.ood.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * In the following implementation, Department will only be shallow copied.
 */
@Data
@AllArgsConstructor
public class EmployeeV1 implements Cloneable {

    @Data
    @AllArgsConstructor
    public static class Department {

        private String name;
    }

    public int age;
    public String name;
    public Department department;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

/*
    Understand hashcode(),  equals() and clone() in Java
        - https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html

    hashcode():
        1. Return a hashcode of the object. This method is supported for the benefit of hash tables.

        2. consistent: If there's not information used in equals() is modified,
                       the result of hashcode() should be consistent when it is
                       invoked on the same object more than once,

        3. If x.equals(y) => true, x.hashcode() == y.hashcode().

        4. It is not a requirement, but best practice that:
            if x.equals(y) => false, then x.hashcode() != y.hashcode()
            which improve the performance of hashtable.

        5. In practice, hashcode() that is defined by Object returns distinct integer for distinct objects.
           However, it is not required by Java programming language.


    equals():
        1. reflective: for any non-null object, x.equals(x) => true
        2. symmetric: for any non-null objects, if x.equals(y) => true, then y.equals(x) => true;
        3. transitive, for any non-null objects, if x.equals(y) => true, y.equals(z) => true, then
           x.equals(z) => true;
        4. consistent: for any non-null objects, multiple invocations of x.equals(y) => true or false
           consistently, given no information used in equals() comparisons on the objects is modified.
        5. with null: x.equals(null) => false;


    clone()
        1) x.clone() != x will be true => will have separate memory address assignment.
        2) x.clone().getClass() == x.getClass() will be true, but these are not absolute requirements.
        3) x.clone().equals(x) will be true, this is not an absolute requirement.

        Java default behavior (from Object.class)
            1. "Deep Copy" for members of primitive data types.
            2. "Shadow Copy" for members of any class types.
            3. You can override the default behavior by overriding clone() method

        reference: https://howtodoinjava.com/java/cloning/a-guide-to-object-cloning-in-java/
 */

